//package com.customException;
// class A
//{
//     static void m1() 
//     {
//         System.out.println("This is a final method.");
//     }
//    static class B
//     {
//         void m1()
//         { 
//             // COMPILE-ERROR! Can't override.
//             System.out.println("Illegal!");
//         }
//        
//     }
//    
//}
//
//
//
//public class finalKeyword  
//{
//	 public static void main(String a[])
//     {
//		 A.B b = new A.B();
//		 b.m1();
//		 A ass = new A();
//		 ass.m1();
//		 
//     }    
//   
//}