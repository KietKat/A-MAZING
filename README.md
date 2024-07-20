<h1>A-MAZING</h1>

- Language: Java, Algorithm Implementation: Java
- The maze size of MxN will have M*N components, O(n)= MxN
- Code breakdown:
    - Firstly, the algorithm will add every possible link between 2 next-to components into an ArrayList 
    - Secondly, shuffle the ArrayList to have it in a random sequence
    - Run the arraylist from the beginning to the end. If the two investigated components are connected, skip else join them
    - The loop stops when everything is joined or the number of components drops to 1
