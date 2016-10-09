package mis.middleware.practicas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArticuloWS {
	

	
private static Map<Integer,Articulo> articulos = new HashMap<Integer,Articulo>();
	
	
	public boolean addArticulo(Articulo p) {
		if(articulos.get(p.getIdarticulo()) != null) return false;
		articulos.put(p.getIdarticulo(), p);
		return true;
	}
	
	
	
	public Articulo getArticulo(int id) {
		return articulos.get(id);
	}
	
	
	public Articulo[] getArticulos() {
		Set<Integer> ids = articulos.keySet();
		Articulo[] p = new Articulo[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = articulos.get(id);
			i++;
		}
		return p;
	}
	
	public boolean deleteArticulo(int id) {
		if(articulos.get(id) == null) return false;
		articulos.remove(id);
		return true;
	}
	
	
}
