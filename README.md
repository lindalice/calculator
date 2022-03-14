# Calculator
## 1. Branches:
Tika izveidoti 5 jauni branch:

- Main;
- Mul;
- Div;
- Development;
- Release.

## 2. Fails Calculator.java:

Tika izveidots viens fails Calculator.java, kurš pēc tam tika vairākas reizes rediģēts, iegūstot šādu gala rezultātu:
```sh
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	private static final DecimalFormat df = new DecimalFormat("0.00");

	static void sum(double x1, double y1) {
		double sum = x1 + y1;

		System.out.println(df.format(x1) + " + " + df.format(y1) + " = " + df.format(sum));
	}

	static void sub(double x1, double y1) {
		double sub = x1 - y1;

		System.out.println(df.format(x1) + " - " + df.format(y1) + " = " + df.format(sub));
	}
	static void mul(double x1, double y1) {
		double mul = x1 * y1;

		System.out.println(df.format(x1) + " * " + df.format(y1) + " = " + df.format(mul));
	}
	static void div(double x1, double y1) {
		double div = x1 / y1;

		System.out.println(df.format(x1) + " / " + df.format(y1) + " = " + df.format(div));
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		char operator;
		// -------------------
		double x1 = 0;
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String x = input.nextLine();

		try {
			x1 = Double.parseDouble(x);

		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis!");
			System.exit(0);
		}
		// --------------------
		double y1 = 0;
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String y = input.nextLine();

		try {
			y1 = Double.parseDouble(y);

		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis! Mēģini vēlreiz!");
			System.exit(1);
		}

		// --------------------
		System.out.print("Izvēlies darbību: '+' vai '-' vai '*' vai '/', ievadot kādu no minētajiem simboliem '+', '-', '*' vai '/'.");
		operator = input.next().charAt(0);

		switch (operator) {
		case '+':
			sum(x1, y1);
			break;
		case '-':
			sub(x1, y1);
			break;
		case '*':
			mul(x1, y1);
			break;
		case '/':
			div(x1, y1);
			break;
		default:
			System.out.println("Nekorekti ievadīta darbība, mēģini vēlreiz");
			break;

		}
		input.close();
	}

}
```

## 3. Calculator.java koda skaidrojums:
### 3.1. Importējam:
- Importējam DecimalFormat, lai izvadē decimālais skaitlis būtu noformēts 2 cipari aiz komata
- Importējam Scanner, lai lietotājs varētu ievadīt ciparus
```sh
import java.text.DecimalFormat;
import java.util.Scanner;
```
### 3.2. Klase Calculator:
Izveudojam klasi Calculator, kura sevī ietvers funkcijas:
```sh
public class Calculator {
```
Definējam statisku mainīgo, lai varētu noteikt formātu, kāds tas būs izvades laikā:
```sh
private static final DecimalFormat df = new DecimalFormat("0.00");
```
### 3.3. Funkcija sum() :
Tiek izveidota funkcija sum, kura satur sevī sasaitīšanas darbību. Pēc tam tā tiks padota uz main klasi, kurā tiks definēti cipari, ar kuriem jāveic darbības. 
```sh
static void sum(double x1, double y1) {
		double sum = x1 + y1;
		System.out.println(df.format(x1) + " + " + df.format(y1) + " = " + df.format(sum));
	}
```
### 3.4. Funkcija sub() :
Analoģiski tiek izveidota sub funkcija:
```sh
static void sub(double x1, double y1) {
		double sub = x1 - y1;
		System.out.println(df.format(x1) + " - " + df.format(y1) + " = " + df.format(sub));
	}
```
### 3.5. Funkcija mul() :
Analoģiski tiek izveidota mul funkcija:
```sh
static void mul(double x1, double y1) {
		double mul = x1 * y1;
		System.out.println(df.format(x1) + " * " + df.format(y1) + " = " + df.format(mul));
	}
```
### 3.6. Funkcija div() :
Analoģiski tiek izveidota div funkcija:
```sh
static void div(double x1, double y1) {
		double div = x1 / y1;
		System.out.println(df.format(x1) + " / " + df.format(y1) + " = " + df.format(div));
	}
```
### 3.7. Klase main(String args[]) :
Main klasē definējam mainīgos:
- `input` ir mainīgais, kurš nodrošinās ievades funkciju lietotājam
- mainīgais `operator` definēs to, kādu funkciju veikt ar switch-case struktūras palīdzību
```sh
public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		char operator;
```
Izvadām paziņojumu, lai lietotājs ievadītu vērtību pirmajam ciparam:
Mainīgajā `x` šī vērība tiek padota.
```sh
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String x = input.nextLine();
```
### 3.8. Try-Catch Statement

Nākamais koda fragments:
- Definējam mainīgo `x1` un piešķiram sākotnējo vērtību 0, lai netiktu uzrādīta kļūda kodā. 
- Izmantojam try-catch, lai nodrošinātu kļūdas pārbaudi ievadītajai vērtībai - pārbaudām vai tika ievadīta skaitliska vērtība, pretējā gadījumā brīdinām, ka "Jāievada skaitlis!"
- Sākotnēji mainīgajam `x` definētais tips bija String, tas bija tāpēc, lai mēs pārbaudītu katru simbolu, ja tiek ievadīts skaitlis neviens cipars. 
- Ja mainīgais `x`, kura tips ir String saturēs vienu vai vairākus ciparus, vai arī decimālskaitli, kur decimāldaļa tiek atdalīta ar '.' - virtuālā mašīna to pieņems kā skaitlisku vērtību.
- Gadījumā, kad tiek konstatēts, ka vērtība ir skaitliska pateicoties try-catch struktūrai, String ievadītā vērtība tiek pārveidota uz double, lai pēc tam varētu veikt aritmētiskas darbības. Ja ievadītā vērtība nav double, tad programma paziņos lietotājam, ka jāievada skaitlis.
- Lai pārveidotu no String uz double, mēs izveidojām mainīgo `x1`, kurā tika ielikta pārveidotā String vērtība, kas iepriekš glabājās mainīgajā `x`. Tagad šī vērtība ir double tipa un atrodas mainīgajā `x1`.
```sh
double x1 = 0;
    try {
		    x1 = Double.parseDouble(x);
		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis!");
			System.exit(0);
		}
```
Analoģiski tiek izveidota ievades apstrāde 2. skaitliskajai vērtībai:
```sh
		System.out.print("Ievadi 1. ciparu (decimālskaitļa atdalīšanai izmanto '.'): ");
		String y = input.nextLine();
		double y1 = 0;
		try {
			y1 = Double.parseDouble(y);
		} catch (NumberFormatException e) {
			System.out.println("Jāievada skaitlis! Mēģini vēlreiz!");
			System.exit(1);
		}
```
Mainīgais operator apstrādā lietotāja ievadi - saglabā sevī ievadīto vērtību
Tālāk izveidojam paziņojumu, lai lietotājs izvēlas darbības veidu, ievadot simbolu:
- "+"
- "-"
- "/" 
- "*"

### 3.9. Switch-Case Statement
Mainīgais `operator` apstrādā lietotāja ievadito vērtību (simbolu '+', '-', '*', '/')
```sh
System.out.print("Izvēlies darbību: '+' vai '-' vai '*' vai '/', ievadot kādu no minētajiem simboliem '+', '-', '*' vai '/'.");
		operator = input.next().charAt(0);
```
Pēc tam tiek izmantots switch-case - lietotājs ievada simbolu un switch-case atpazīstot simbolu nosaka, kura darbība tiks izpildīta:
```sh
switch (operator) {
		case '+':
			sum(x1, y1);
			break;
		case '-':
			sub(x1, y1);
			break;
		case '*':
			mul(x1, y1);
			break;
    case '/':
			div(x1, y1);
			break;
		default:
			System.out.println("Nekorekti ievadīta darbība, mēģini vēlreiz");
			break;
		}
```
Aizveram skeneri un uzliekam noslēdzošās figūriekavas:
```sh
input.close();
	}
}
```
## 4. Branch saturs:
### 4.1. Branch main:
- Šajā branch tika ietvertas 2 funkcijas: saskaitīšana un atņemšana
- Tika izveidots fails Calculator.java, kas sevī ietvēra visu 2. nodaļā aprakstīto, izņemot dalīšanas un reizināšanas funkciju. 
- Sākotnēji branch tika izveidots lokāli, pēc tam šie dati no Git Bash tika pārinstalēti uz Git Hub mājas lapas repo

### 4.1. Branch mul:
- Šis branch tika izveidots analoģiski iepriekšējam
- Tika pievienots rediģēts iepriekšējais Calculator. java fails - pievienoju reizināšanas funkciju
- Updateoju Git Hub mājas lapas repo (augšupielādēju šo branch un attiecīgos datus)

### 4.2. Branch div:
- Arī šis branch tika izveudots analoģiski iepriekšējiem
- Arī šajā branch tika  pievienots rediģēts iepriekšējais Calculator. java fails - pievienoju dalīšanas funkciju
- Updateoju Git Hub mājas lapas repo (augšupielādēju šo branch un attiecīgos datus)

### 4.3. Branch Development:
- Šeit izmantoju funkciju merge un apvienoju visus failus kopā, iegūstot kodu, kas ir šī apraksta 2. nodaļā
- Updateoju Git Hub mājas lapas repo (augšupielādēju šo branch un attiecīgos datus)
- Ieguvu gatavu Calculator.java failu, kurā ir visas elementārās aritmētiskās darbības

### 4.4. Branch release:
- Izveidoju branch 
- Updateoju Git Hub mājas lapas repo (augšupielādēju šo branch)
- Kā visus - arī šajā branch tika iekļauts by default READ.me fails
- Aprakstīju šo darbu ar markdown palīdzību (rediģējot minēto READ.me failu), kas ir šis fails (apraksts)

