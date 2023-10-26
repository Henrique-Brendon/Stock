package entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Items {
    private int id;
    private String name;
    private String deliveryDate;
    private double price;

    public Items(){

    }

    
    protected Items(int id, String name, double price, String data) {
        this.id =  id;
        this.name = name;
        this.price = price;
        this.deliveryDate = data;
    }

    private String generateName() {
        String name[] = new String[41];
		name[0] = "RTX 2060";
		name[1] = "RTX 2060 SUPER";
		name[2] = "RTX 2070";
		name[3] = "RTX 2070 TI";
		name[4] = "RTX 2080";
		name[5] = "RTX 2080 TI";
		name[6] = "RTX 3060";
		name[7] = "RTX 3060 TI";
		name[8] = "RTX 3070";
		name[9] = "RTX 3070 TI";
		name[10] = "RTX 3080";
		name[11] = "RTX 3080 TI";
		name[12] = "RTX 4060";
		name[13] = "RTX 4060 TI";
		name[14] = "RTX 4070";
		name[15] = "RTX 4070 TI";
		name[16] = "RTX 4080";
		name[17] = "RTX 4080 TI";
		name[18] = "RX 6600";
		name[19] = "RX 6600 XT";
		name[20] = "RX 6700";
		name[21] = "RX 6700 XT";
		name[22] = "RX 6800";
		name[23] = "RX 6800 XT";
		name[24] = "Ryzen 5 3600";
		name[25] = "Ryzen 5 4650";
		name[26] = "Ryzen 5 5600G";
		name[27] = "Ryzen 5 5600X";
		name[28] = "i5 1100";
		name[29] = "i7 9800";
		name[30] = "i7 1200";
		name[31] = "i9 1300K";
		name[32] = "Mouse Gamer";
		name[33] = "Teclado mecânico";
		name[34] = "Monitor 144hz";
		name[35] = "v Samsbung 65p 2160+";
		name[36] = "Samsung s22";
		name[37] = "Iphone 13 Pro";
		name[38] = "Iphone 9";
		name[39] = "Iphone X";
		name[40] = "Cadeira gamer";

        String aux = "";
            Random random = new Random();
            int indiceAleatorio = random.nextInt(name.length);
            if(name[indiceAleatorio] != null){
                aux = name[indiceAleatorio];
            }
        return aux;
    }

    private LocalDateTime generateDate(Random random) {
        LocalDateTime startDate = LocalDateTime.of(2020, 1, 12, 07, 30);
        LocalDateTime endDate = LocalDateTime.of(2023, 1, 12, 17, 30);

        long minSeconds =  startDate.toEpochSecond(java.time.ZoneOffset.UTC);
        long maxSeconds =  endDate.toEpochSecond(java.time.ZoneOffset.UTC);

        long randomSeconds = minSeconds + (long) (random.nextDouble() * (maxSeconds - minSeconds));
        return LocalDateTime.ofEpochSecond(randomSeconds, 0, java.time.ZoneOffset.UTC);
    }
    
    public Items generateList(){
        Random random = new Random();
        LocalDateTime randomDate = generateDate(random);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dateFormatter = "";
        if(randomDate != null){
            dateFormatter = randomDate.format(formatter);
        }
        
        String a = generateName();
        int i = random.nextInt(30);
        Map<String, Items> itemMap = new HashMap<>();
        itemMap.put("RTX 2060", new Items(i, "RTX 2060", 1500.0, dateFormatter));
        itemMap.put("RTX 2060 SUPER", new Items(i, "RTX 2060 SUPER", 1700.0, dateFormatter));
        itemMap.put("RTX 2070", new Items(i, "RTX 2070", 1900.0, dateFormatter));
        itemMap.put("RTX 2070 SUPER", new Items(i, "RTX 2070 SUPER", 2000.0, dateFormatter));
        itemMap.put("RTX 2080", new Items(i, "RTX 2080", 2300.0, dateFormatter));
        itemMap.put("RTX 2080 SUPER", new Items(i, "RTX 2080 SUPER", 2500.0, dateFormatter));
        itemMap.put("RTX 3060", new Items(i, "RTX 3060", 2350.0, dateFormatter));
        itemMap.put("RTX 3060 TI", new Items(i, "RTX 3060 TI", 2600.0, dateFormatter));
        itemMap.put("RTX 3070", new Items(i, "RTX 3070", 2500.0, dateFormatter));
        itemMap.put("RTX 3070 TI", new Items(i, "RTX 3070 TI", 2800.0, dateFormatter));
        itemMap.put("RTX 3080", new Items(i, "RTX 3080", 3000.0, dateFormatter));
        itemMap.put("RTX 3080 TI", new Items(i, "RTX 3080 TI ", 3500.0, dateFormatter));
        itemMap.put("RTX 4060", new Items(i, "RTX 4060", 3000.0, dateFormatter));
        itemMap.put("RTX 4060 TI", new Items(i, "RTX 4060 TI", 3500.0, dateFormatter));
        itemMap.put("RTX 4070", new Items(i, "RTX 4070", 3300.0, dateFormatter));
        itemMap.put("RTX 4070 TI", new Items(i, "RTX 4070 TI", 3700.0, dateFormatter));
        itemMap.put("RTX 4080", new Items(i, "RTX 4080", 4200.0, dateFormatter));
        itemMap.put("RTX 4080 TI", new Items(i, "RTX 4080 TI", 4500.0, dateFormatter));
        itemMap.put("RX 6600", new Items(i, "RX 6600", 2300.0, dateFormatter));
		itemMap.put("RX 6600 XT", new Items(i, "RX 6600 XT", 2500.0, dateFormatter)); 
		itemMap.put("RX 6700", new Items(i, "RX 6700", 2600.0, dateFormatter));
		itemMap.put("RX 6700 XT", new Items(i, "RX 6700 XT", 2800.0, dateFormatter));
		itemMap.put("RX 6800", new Items(i, "RX 6800", 3000.0, dateFormatter));
		itemMap.put("RX 6800 XT", new Items(i, "RX 6800 XT", 3200.0, dateFormatter));
		itemMap.put("Ryzen 5 3600", new Items(i, "Ryzen 5 3600", 300.0, dateFormatter));
		itemMap.put("Ryzen 5 4650", new Items(i, "Ryzen 5 4650", 300.0, dateFormatter));
		itemMap.put("Ryzen 5 5600G", new Items(i, "Ryzen 5 5600G", 300.0, dateFormatter));
		itemMap.put("Ryzen 5 5600X", new Items(i, "Ryzen 5 5600X", 300.0, dateFormatter));
		itemMap.put("i5 1100", new Items(i, "i5 1100", 850.0, dateFormatter));
		itemMap.put("i7 9800", new Items(i, "i7 9800", 1100.0, dateFormatter));
		itemMap.put("i7 1200", new Items(i, "i7 1200", 2500.0, dateFormatter));
		itemMap.put("i9 1300K", new Items(i, "i9 1300K", 3200.0, dateFormatter));
		itemMap.put("Mouse Gamer", new Items(i, "Mouse Gamer", 70.0, dateFormatter));
		itemMap.put("Teclado mecânico", new Items(i, "Teclado mecânico", 300.0, dateFormatter));
		itemMap.put("Monitor 144hz", new Items(i, "Monitor 144hz", 1200.0, dateFormatter));
		itemMap.put("Tv Samsung 65p 2160+", new Items(i, "Tv Samsung 65p 2160+", 4000.0, dateFormatter));
		itemMap.put("Samsung s22", new Items(i, "Samsung s22", 2500.0, dateFormatter));
		itemMap.put("Iphone 13 Pro", new Items(i, "Iphone 13 Pro", 3000.0, dateFormatter));
		itemMap.put("Iphone 9", new Items(i, "Iphone 9", 900.0, dateFormatter));
		itemMap.put("Iphone X", new Items(i, "Iphone X", 1000.0, dateFormatter));
		itemMap.put("Cadeira gamer", new Items(i, "Cadeira gamer", 400.0, dateFormatter));
        Items item = new Items();

        if(itemMap.get(a) != null) {
            item = itemMap.get(a);
        }
        return item;
    }


    @Override
    public String toString() {
        StringBuilder btr =  new StringBuilder();
        btr.append("Product #" + id + " ");
        btr.append(name + ", delivery date ");
        btr.append(deliveryDate);
        btr.append(". Price " + String.format("%.2f", price));
        btr.append(" R$");
        return btr.toString();
    }

}


