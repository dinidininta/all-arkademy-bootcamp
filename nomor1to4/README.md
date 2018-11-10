# arkademy-bootcamp

Implementasi soal nomor 1-4

### nomor 1
```sh
import nomor1.AvailableColorAndSize;
import nomor1.Produk;

List<String> colors = new ArrayList<>();
colors.add("M");
colors.add("L");
        
AvailableColorAndSize avcs = new AvailableColorAndSize("red", colors);
        
Produk produk = new Produk("12341822", "basic t-shirt", 70000, avcs, false);
produk.printJSON();
```

### nomor 2
```sh
Nomor2 nomor2 = new Nomor2();
System.out.println(nomor2.verify("qwErt_Qq"));
```

### nomor 3
```sh
Nomor3 nomor3 = new Nomor3();
nomor3.segitigaAsli(7);
```

### nomor 4
```sh
Nomor4 nomor4 = new Nomor4();
System.out.println(nomor4.count_handshake(3, 2));
```
