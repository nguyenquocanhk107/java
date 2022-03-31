public class soccerplayer {
        String name;
        int number;
        int xlocation;
        int ylocation;

        public int number()
        {
                return number;
        }
        public String name(){
                return name;

        }
        public int Xlocation(){
                return xlocation;
        }
        public int Ylocation(){
                return ylocation;
        }
        public soccerplayer(){
                name= "nguyễn quốc anh" ;
                xlocation=1;
                ylocation=1;
        }
        public void run(){
                xlocation++;
                ylocation++;
        }
        public void kickball(){
                xlocation+=5;
                xlocation+=5;
        }
}
