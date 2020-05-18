
package tareacaños;


class Producto {
    private String descripcion;
    private Material[] material;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String desc, int cant) {
        this.descripcion = desc;
        this.material = new Material[cant];
    }
    public void agregarMaterial(Material m)
    {
        for (int i = 0; i < material.length; i++) 
        {
            if (material[i] == null) 
            {
                material[i] = m;
                break;
            }
        }
    }
    public float calcularTotal()
    {
        float acTotal = 0;
        
        for(Material m : material)
        {
            if(m != null)
            {
                acTotal += m.getValorUnitario();
            }
        }
        
        return acTotal;
    }
    public boolean existeMaterial(int codigo)
    {
        boolean encontrado = false;
        
        for(Material m : material)
        {
           if(m != null && m.getCodigo() == codigo)
           {
               
               encontrado = true;
               break;
           }
        }
        return encontrado;
    }
    public Material[] materialesMenoresA(float valorUnitario)
    {
        Material[] mMA = new Material[material.length];
        int proxIndice = 0;
        
        for (int i = 0; i < material.length; i++) 
        {
            if(material[i] != null && material[i].getValorUnitario() < valorUnitario)
            {
                mMA[proxIndice] = material[i];
                proxIndice++;
            }
        }
        return mMA;
    }
    public int[] cantMatPrecio()
    {
        int c[] = {0 , 0 , 0 , 0};
        
        for(Material m : material)
        {
            if(m != null)
            {
                if(0 < m.getValorUnitario() && m.getValorUnitario() <= 10)
                {
                    c[0]++;
                }
                else if (10 < m.getValorUnitario() && m.getValorUnitario() <= 20)
                {
                    c[1]++;
                }
                else if (20 < m.getValorUnitario() && m.getValorUnitario() <= 30)
                {
                    c[2]++;
                }
                else if (30 < m.getValorUnitario() )
                {
                    c[3]++;
                }
                
            }
            
            
        }
        return c;
    }

    @Override
    public String toString() {
        return "Producto{" + "descripcion=" + descripcion + ", material=" + material + '}';
    }
    
    
    
    
    
}
