//package originzone;
//
//import java.util.Scanner;
//
//public class OriginZone {
//        public static void main(String [] args){
//
//            Scanner input = new Scanner(System.in);
//
//            System.out.printf("Welcome to Nigeria! select your Geopolitical option %n 1 North Central  %n 2 North East %n" + "3 North West %n 4 South East %n 5 South South %n 6 South West %n Enter number for your menu: ");
//
//            String geoPolitical = input.nextLine();
//
//            Switch (geoPolitical);{
//                case1:
//                System.out.println(" 1:North Central");
//                System.out.printf("%n 1 Kogi state %n 2 Kwara state %n 3 Plateau state %n 4 Niger state %n 5 Benue state %n 6 fct %n 7 Nasarawa state %n Enter selection: ");
//                System.out.print();
//                String northCentralMenu = input.next();
//                Switch(northCentralMenu) ;{
//                    case1:
//                    System.out.println("You are from Kogi state" + northCentralMenu);
//                    break;
//                    case2:
//                    System.out.println("You are from Kwara state" + northCentralMenu);
//                    break;
//                    case3:
//                    System.out.println("You are from Plateau state" + northCentralMenu);
//                    break;
//                    case4:
//                    System.out.println("You are from Niger state" + northCentralMenu);
//                    break;
//                    case5:
//                    System.out.println("You are from Benue state" + northCentralMenu);
//                    break;
//                    case6:
//                    System.out.println("You are from Fct" + northCentralMenu);
//                    break;
//                    case7:
//                    System.out.println("You are from Nasarawa state" + northCentralMenu);
//                    break;
//                }break;
//
//                case2:
//                System.out.println(" 2:North East");
//                System.out.printf("%n 1 Bauchi state %n 2 Borno state %n 3 Adamawa state %n 4 Taraba state %n 5 Gombe state %n 6 Yobe state %n Enter selection: ");
//                System.out.print();
//                String northEastMenu = input.next();
//                Switch(northEastMenu);{
//                    case1:
//                    System.out.println("You are from Bauchi state" + northEastMenu);
//                    break;
//                    case2:
//                    System.out.println("You are from Borno state" + northEastMenu);
//                    break;
//                    case3:
//                    System.out.println("You are from Adamawa state" + northEastMenu);
//                    break;
//                    case4:
//                    System.out.println("You are from Taraba state" + northEastMenu);
//                    break;
//                    case5:
//                    System.out.println("You are from Gombe state" + northEastMenu);
//                    break;
//                    case6:
//                    System.out.println("You are from Yobe state" + northEastMenu);
//                    break;
//                }break;
//
//                case3:
//                System.out.println(" 3:North West");
//                System.out.printf("%n 1 Zamfara state %n 2 Sokoto state %n 3 Kaduna state %n 4 Kebbi state %n 5 Kastina state %n 6 Kano state %n 7 Jigawa state %n Enter selection: ");
//                System.out.print();
//                String northWestMenu = input.nextLine();
//                Switch(northWestMenu); {
//                    case1:
//                    System.out.println("You are from Zamfara state" + northWestMenu);
//                    break;
//                    case2:
//                    System.out.println("You are from Sokoto state" + northWestMenu);
//                    break;
//                    case3:
//                    System.out.println("You are from Kaduna state" + northWestMenu);
//                    break;
//                    case4:
//                    System.out.println("You are from Kebbi state" + northWestMenu);
//                    break;
//                    case5:
//                    System.out.println("You are from Kastina state" + northWestMenu);
//                    break;
//                    case6:
//                    System.out.println("You are from Kano state" + northWestMenu);
//                    break;
//                    case7:
//                    System.out.println("You are from Jigawa state" + northWestMenu);
//                    break;
//                }break;
//
//                case4:
//                System.out.println(" 4:South East");
//                System.out.printf("%n 1 Enugu state %n 2 Ebonyi state %n 3 Imo state %n 4 Abia state %n 5 Anambra state %n Enter selection: ");
//                System.out.print();
//                String southEastMenu = input.nextLine();
//                Switch(southEastMenu); {
//                    case1:
//                    System.out.println("You are from Enugu state" + southEastMenu);
//                    break;
//                    case2:
//                    System.out.println("You are from Ebonyi state" + southEastMenu);
//                    break;
//                    case3:
//                    System.out.println("You are from Imo state" + southEastMenu);
//                    break;
//                    case4:
//                    System.out.println("You are from Abia state" + southEastMenu);
//                    break;
//                    case5:
//                    System.out.println("You are from Anambra state" + southEastMenu);
//                    break;
//                }break;
//
//                case5:
//                System.out.println(" 5:South South");
//                System.out.printf("%n 1 Bayelsa state %n 2 Akwa Ibom state %n 3 Edo state %n 4 Rivers state %n 5 Cross Rivers state %n 6 Delta state %n Enter selection: ");
//                System.out.print();
//                String southSouthMenu = input.nextLine();
//                Switch(southSouthMenu) ;break;
//
//                case6:
//                System.out.println(" 6:South West");
//                System.out.printf("%n 1 Oyo state %n 2 Ekiti state %n 3 Osun state %n 4 Ondo state %n 5 Lagos state %n 6 Ogun state %n Enter selection: ");
//                System.out.print();
//                String southWestMenu = input.nextLine();
//                Switch(southWestMenu) ;{
//                    case1:
//                    System.out.println("You are from Oyo state" + southWestMenu);
//                    break;
//                    case2:
//                    System.out.println("You are from Ekiti state" + southWestMenu);
//                    break;
//                    case3:
//                    System.out.println("You are from Osun state" + southWestMenu);
//                    break;
//                    case4:
//                    System.out.println("You are from Ondo state" + southWestMenu);
//                    break;
//                    case5:
//                    System.out.println("You are from Lagos state" + southWestMenu);
//                    break;
//                    case6:
//                    System.out.println("You are from Ogun state" + southWestMenu);
//                    break;
//                }break;
//            }
//        }
//
//    }
