Algoritmo de búsqueda en anchura en grafos, recibe un nodo inicial s y visita todos los nodos alcanzables desde s. BFS también halla la distancia más corta entre el nodo inicial s y los demás nodos si todas las aristas tienen peso 1.
SE DEBEN LIMPIAR LAS ESTRUCTURAS DE DATOS ANTES DE UTILIZARSE

static int v; //vertices
static int MAX=100005; 
static ArrayList<Integer> ady[] = new ArrayList[MAX]; //lista de Adyacencia
static long distance[] = new long[MAX];

//Recibe el nodo inicial s
static void bfs(int s){
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(s); 
    distance[s] = 0;
    int actual, i, next;
        
    while( !q.isEmpty() ){
        actual = q.poll();
        for( i = 0; i < ady[actual].size(); i++){
            next = ady[actual].get(i);
            if( distance[next] == -1 ){
                distance[next] = distance[actual] + 1;
                q.add(next);
            }
        }
    }
}

public static void main(String[] args) {
    
    for (int j = 0; j <= v; j++) { //Inicializacion de las estructuras
             ady[j] = new ArrayList<Integer>(); //Lista de Adyacencia
            distance[j] = -1; //Distancia a cada nodo
    }

}
