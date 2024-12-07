import java.util.ArrayList;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        Woman w1 = new Woman("まい", 22, 4500000);
        Woman w2 = new Woman("めい", 26, 5000000);
        Woman w3 = new Woman("えりこ", 34, 12000000);


        ArrayList <Woman> list= new ArrayList <Woman>();

        list.add(w1);
        list.add(w2);
        list.add(w3);

        for(int i= 0; i < 3; i++){
            Woman a =list.get(i);
            System.out.println(a.getName()+ " " + a.getAge() + "歳" + " " + a.getSalary() + "万");
            System.out.println(a.isTarget());
        }
    }
}