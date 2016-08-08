if (tN == 1){
         System.out.println("Disk 1 "
         + from + " to " + to);
      }else {
         doTowers(tN - 1, from, to, inter);
         System.out.println("Disk "
         + tN + " from " + from + " to " + to);
         doTowers(tN - 1, inter, from, to);
      }
