package oop.lambdasExp;

import java.util.List;
@FunctionalInterface
public  interface IWalker {
    void walk();

    default double run(){
        return Math.PI * 2;
    }

    default double getSpeed(){
        return 0;
    }

    static IWalker bestWalker(List<IWalker> list){
        IWalker bestWalker = list.get(0);

        for (int i = 0; i < list.size(); i++) {
          if (list.get(i).getSpeed() > bestWalker.getSpeed()){
              bestWalker = list.get(i);
          }
        }
        return bestWalker;
    }


}
