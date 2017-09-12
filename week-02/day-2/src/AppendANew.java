public class AppendANew {
    public static void main(String[] args) {
        // - Create an array variable named `nimals`
        //   with the following content: `["kuty", "macsk", "cic"]`
        // - Add all elements an `"a"` at the end

        String[] nimals = {"kuty", "macsk", "cic"};
        String add = "a";

        for (int i = 0; i < 3; i++) {
            nimals[i] = nimals[i].concat(add);
            System.out.println(nimals[i]);
        }
    }
}
