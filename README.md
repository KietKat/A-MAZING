# A-MAZING
    Language: Java, Algorithm Implementation: Java
    The maze size of MxN will have M*N components, O(n)= MxN
    FIrstly, the algorithm wiil added every possible link between 2 next-to component into an arraylist 
    Secondly, shuffle the arraylist to have it in a random sequence
    Run the arraylist from the beginning to the end. If the two investigated components are connected, skip, else join them
    The loop stop when every thing is joined, or we the number of components drop to 1
