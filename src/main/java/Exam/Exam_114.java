package Exam;

/**
 * Created by Administrator on 2017/4/8.
 * 有工人,农民,教师,科学家,服务生
 * ,其中,工人,农民,服务生只有基本工资.教师除基本工资外,还有课酬(元/天),科学家除基本工资外,还有年终奖,
 * 请你写出相关类,并编写测试类将各种类型的员工的全年工资打印出来。
 */
public class Exam_114 {}


    class Worker {
        //工人工资
        public void WorkerWages() {
            System.out.println("工人的全年工资是：每月基本工资"+"*"+"12");
    }
    }
//--------------------------------------------------------------------------------

 class Farmer {
            //农夫工资
            public void farmerWages() {
                System.out.println("农夫的全年工资是：每月基本工资"+"*"+"12");
            }
        }


    //--------------------------------------------------------------------------------
    class Waiter {
        //服务员工资
        public void waiterWages() {
            System.out.println("服务员的全年工资是：每月基本工资"+"*"+"12");
        }
    }
    //---------------------------------------------------------------------------------
class Teacher{
    //教师工资
    public void teacherWages() {
        System.out.println("教师的全年工资是：每月基本工资"+"*"+"12"+"+"+"课酬"+"*"+"360");
}
    }
        //-----------------------------------------------------------------------------------
        class Scientist {
        //科学家工资
            public void scientistWages() {
                System.out.println("科学家的全年工资是：每月基本工资"+"*"+"12"+"+"+"年终奖");
            }

        }

class text {
    public static void main(String[] args) {
        Worker worker = new Worker();//工人
        worker.WorkerWages();
        Farmer farmer = new Farmer();//农夫
        farmer.farmerWages();
        Waiter waiter = new Waiter();//侍者
        waiter.waiterWages();
        Teacher teacher = new Teacher();//老师
        teacher.teacherWages();
        Scientist scientist = new Scientist();//科学家
        scientist.scientistWages();
    }
}



