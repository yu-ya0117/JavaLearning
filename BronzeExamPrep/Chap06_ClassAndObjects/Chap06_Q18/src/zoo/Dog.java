package zoo;

import zoo.animal.Animal;

public class Dog extends Animal{
    public void bark(){
        System.out.println(name);   //public、OK
        System.out.println(age);    //protected、サブクラスなのでOK
        //System.out.println(type);     //デフォルト、パッケージが違うためエラー
        //System.out.println(secret);   //private、クラスが違うためエラー
    }
}
