package phonebookmenu;
import java.util.Scanner;
public class PhoneBookMenu {
        public static void displayMainMenu() {
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call Register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call Divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
        }

        public static void displayPhoneBookSubMenu() {
            System.out.println("1. Search");
            System.out.println("2. Service Nos");
            System.out.println("3. Add name");
            System.out.println("4. Erase");
            System.out.println("5. Edit");
            System.out.println("6. Assign tone");
            System.out.println("7. Send b'card");
            System.out.println("8. Options");
            System.out.println("9. Speed dials");
            System.out.println("10. Voice tags");
            System.out.println("0. Back");
        }

        public static void handlePhoneBookSearch() {
            System.out.println("Search");

        }

        public static void handlePhoneBookOptions() {
            System.out.println("1. Type of view");
            System.out.println("2. Memory status");

        }

        public static void displayMessagesSubMenu() {
            System.out.println("1. Write and send a text message");
            System.out.println("2. Read text message");
            System.out.println("3. Views saved messages");
            System.out.println("4. Picture message");
            System.out.println("5. Templates");
            System.out.println("6. Smileys");
            System.out.println("7. Message settings");
            System.out.println("8. Info service");
            System.out.println("9. Voice mailbox number");
            System.out.println("10. Service command editor");
        }

        public static void handleMessageSettings() {
            System.out.println("Message settings");

        }

        public static void displayChatSubMenu() {
            System.out.println("1. Start a chat");
            System.out.println("2. Read received message");
        }

        public static void handleChatOptions() {
            System.out.println("1.Edit chat name");
            System.out.println("2.View chat history");

        }

        public static void displayCallRegisterSubMenu() {
            System.out.println("1. Missed calls");
            System.out.println("2. Received calls");
            System.out.println("3. Dialled numbers");
            System.out.println("4. Erased recent call lists");
            System.out.println("5. Show call duration");
            System.out.println("6. Show call costs");
            System.out.println("7. Show costs in");
            System.out.println("8. Call cost settings");
            System.out.println("9. Prepaid credit");
        }

        public static void handleShowCallDuration() {
            System.out.println("Last call duration");
            System.out.println("All calls' duration");
            System.out.println("Received calls' duration");
            System.out.println("Dialled calls' duration");
            System.out.println("Clear timers");

        }

        public static void handleCallCostSettings() {
            System.out.println("1.Call cost limit");
            System.out.println("2.Show cost");

        }

        public static void displayTonesSubMenu() {
            System.out.println("1. Ringing tone");
            System.out.println("2. Ringing volume");
            System.out.println("3. Incoming call alert");
            System.out.println("4. Composer");
            System.out.println("5. Message alert tone");
            System.out.println("6. Keypad tones");
            System.out.println("7. Warning tones");
            System.out.println("8. Vibrating alert");
            System.out.println("9. Screen saver");
        }

        public static void handleComposer() {
            System.out.println("1.Play");
            System.out.println("2.Save");
            System.out.println("3.Tempo");
            System.out.println("4.Clear screen");
            System.out.println("5.Exit");

        }

        public static void displaySettingsSubMenu() {
            System.out.println("1. Call settings");
            System.out.println("2. Phone settings");
            System.out.println("3. Security settings");
            System.out.println("4. Restore factory settings");
        }

        public static void handleCallSettings() {
            System.out.println("1.Automatic redial");
            System.out.println("2.Speed dialling");
            System.out.println("3.Call waiting options");
            System.out.println("4.Own number sending");
            System.out.println("5.Phone line in use");
            System.out.println("5.Automatic answer");

        }

        public static void handlePhoneSettings() {
            System.out.println("1.Language");
            System.out.println("2.Cell info display");
            System.out.println("3.Welcome note");
            System.out.println("4.Network selection");
            System.out.println("5.Lights");
            System.out.println("5.Confirm SIM service actions");

        }

        public static void handleSecuritySettings() {
            System.out.println("1.PIN code request");
            System.out.println("2.Call barring sevice");
            System.out.println("3.Fixed dialing");
            System.out.println("4.Closed user group");
            System.out.println("5.Phone security");
            System.out.println("5.Change access codes");

        }

        public static void displayCallDivertSubMenu() {
            System.out.println("1. Divert when busy");
        }

        public static void displayGamesSubMenu() {
            System.out.println("1. Snake II");
            System.out.println("2. Space Impact");
            System.out.println("3. Bantumi");
            System.out.println("4. Pairs II");
            System.out.println("5. Settings");
        }

        public static void displayCalculatorSubMenu() {
            System.out.println("1. Calculation");
            System.out.println("2. Currency conversion");
            System.out.println("3. Currency conversion in standby mode");
        }

        public static void displayReminderSubMenu() {
            System.out.println("1. Add new");
            System.out.println("2. Erase");
            System.out.println("3. View all");
        }

        public static void displayClockSubMenu() {
            System.out.println("1. Alarm clock");
            System.out.println("2. Clock settings");
            System.out.println("3. Date setting");
            System.out.println("4. Stopwatch");
            System.out.println("5. Countdown timer");
            System.out.println("5. Automatic date and time");
        }

        public static void displayProfilesSubMenu() {
            System.out.println("1. Silent");
            System.out.println("2. Personalise");
            System.out.println("3. General");
        }

        public static void displaySimServicesSubMenu() {

        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            displayMainMenu();
            int userInput = input.nextInt();

            if (userInput == 1) {
                displayPhoneBookSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 1) {
                    handlePhoneBookSearch();
                } else if (subMenuInput == 8) {
                    handlePhoneBookOptions();
                } else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 2) {
                displayMessagesSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 7) {
                    handleMessageSettings();
                } else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 3) {
                displayChatSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 1) {
                    handleChatOptions();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 4) {
                displayCallRegisterSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 5) {
                    handleShowCallDuration();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 5) {
                displayTonesSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 4) {
                    handleComposer();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 6) {
                displaySettingsSubMenu();
                int subMenuInput = input.nextInt();

                if (subMenuInput == 1){
                    handleCallSettings();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
                if (subMenuInput == 2){
                    handlePhoneSettings();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
                if (subMenuInput == 3){
                    handleSecuritySettings();
                }  else if (subMenuInput == 0) {
                    displayMainMenu();
                }
            } else if (userInput == 7) {
                displayCallDivertSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 8) {
                displayGamesSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 9) {
                displayCalculatorSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 10) {
                displayReminderSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 11) {
                displayClockSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 12) {
                displayProfilesSubMenu();
                int subMenuInput = input.nextInt();

            } else if (userInput == 13) {
                displaySimServicesSubMenu();
                int subMenuInput = input.nextInt();

            }

        }
    }
