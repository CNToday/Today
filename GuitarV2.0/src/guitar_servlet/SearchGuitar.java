package guitar_servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.Messaging.SyncScopeHelper;

import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

import com.DaoImpl.InventoryImpl;
import com.Idao.InventoryIDao;
import model.Inventory;
import allenum.Builder;
import allenum.Type;
import allenum.Wood;

/**
 * Servlet implementation class nihao
 */
@WebServlet("/SearchGuitar")
public class SearchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		  //调用初始化库存	
		String  builder=request.getParameter("builder");
		String  model=request.getParameter("model");
		String  type=request.getParameter("type");
		String  numStrings=request.getParameter("numStrings");
		String  topwood=request.getParameter("topwood");
		String  backwood=request.getParameter("backwood");
			//初始化库存	
			initializeInventory();
		    //封装用户构想的吉他规格。
		   GuitarSpec whatErinLikes = 
		    		/*new GuitarSpec(Builder.RYAN, "02", Type.ELECTRIC, 6, Wood.ALDER, Wood.ALDER);*/
		    		new GuitarSpec(Builder.valueOf(builder), model, 
		       Type.valueOf(type), Integer.parseInt(numStrings), Wood.valueOf(backwood), Wood.valueOf(topwood));
		    //调用库存的search方法，返回list
		    List matchingGuitars = Inventory.search(whatErinLikes);
		   //不为空
		    PrintWriter out=response.getWriter();
		  //  out.println(Builder.valueOf(builder)+numStrings+Type.valueOf(type)+Integer.parseInt(numStrings)+ Wood.valueOf(backwood)+ Wood.valueOf(topwood));
			
		    if (!matchingGuitars.isEmpty()) {
		      System.out.println("Erin, you might like these guitars:");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        GuitarSpec spec = guitar.getSpec();
		        out.println("  We have a " +
		          spec.getBuilder() + " " + spec.getModel() + " " +
		          spec.getType() + " guitar:\n     " +
		          spec.getBackWood() + " back and sides,\n     " +
		          spec.getTopWood() + " top.\n  You can have it for only $" +
		          guitar.getPrice() + "!\n  -------------------------------------");
		      }
		    } else {
		     out.println("Sorry, Erin, we have nothing for you.");
		    }
		  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	
	
	
	private static void initializeInventory(){
	//面向接口：
		InventoryIDao inventorydao = new InventoryImpl();
		
	try {
		boolean a= inventorydao.findAll();
		System.out.print(a);	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	//初始化库存  
/*private static void initializeInventory(Inventory inventory) {
		    inventory.addGuitar("11277", 3999.95, 
		      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
		                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		    inventory.addGuitar("V95693", 1499.95, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("V9512", 1549.95, 
		      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		    inventory.addGuitar("122784", 5495.95, 
		      new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
		                     Wood.MAHOGANY, Wood.ADIRONDACK));
		    inventory.addGuitar("76531", 6295.95, 
		      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("70108276", 2295.95, 
		      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("82765501", 1890.95, 
		      new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		    inventory.addGuitar("77023", 6275.95, 
		      new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
		                     Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		    inventory.addGuitar("1092", 12995.95, 
		      new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
		                     Wood.INDIAN_ROSEWOOD, Wood.CEDAR));
		    inventory.addGuitar("566-62", 8999.95, 
		      new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
		                     Wood.COCOBOLO, Wood.CEDAR));
		    inventory.addGuitar("6 29584", 2100.95, 
		      new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 
		                     6, Wood.MAHOGANY, Wood.MAPLE));
		  }*/
}
