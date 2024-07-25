
public class Func {

    public int soma (int a, int b) {
               return a + b;
        }

        public Object descricao (String nome, int idade) {
               return "Nome: " + nome + ", idade " + idade;
        }

        public int factory (int a) {
            if (a == 0) {
                return 1;
            }
            return a * factory(a - 1);
        }

        public int fibonacci (int a) {
            if (a <= 1) {
                return a;
            } return fibonacci(a - 1) + fibonacci(a - 2);
        }

        public boolean primo (int a) {
            if (a <= 1) {
                return false;
            }
            for (int i = 2; 1 <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public boolean teste (int a) {
         if (a / 1 == a || a / a == 1) {
                 return true;
          }  return false;
        }





}
