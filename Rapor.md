Her proje sonunda yazdığım kodların doğru olup olmadığını test ettim ,gerektiğinde düzelttim.Şimdi,programların son hallerinden elde ettiğim bazı sonuçları sizlerle paylaşacağım:
PROJE 1:tek mi çift mi 
Beklenti:Girinen sayının 2'ye bölününceki kalanına(0 mı değil mi) göre "......sayısı tek/çift sayıdır" demesidir.
TEST1  girdi:15 çıktı:15 sayısı tek sayıdır. 
TEST2  girdi:20 çıktı:20 sayısı çift sayıdır.

PROJE 2: pozitif mi,negatif mi,sıfır mı?
Beklenti:Girilen sayının 0 ile karşılaştırmasına (büyük mü , küçük mü , eşit mi) göre ".....sayısı pozitiftir/negatiftir/0'dır demesidir.
TEST1  girdi: 0  çıktı:0 sayısı 0'dır.
TEST2  girdi:132 çıktı:132 sayısı pozitiftir.
TEST3  girdi:-44 çıktı:-44 sayısı negatiftir.

PROJE 3:iki sayının büyüğü
Beklenti:Sayıladan hangisinin büyük olduğunu (ya da eşit olup olmadıklarını) if ,else if ve else komutları ile belirleyip ekrana "....sayısı ,......sayısından büyüktür şeklinde" veya "....sayısı ile ....sayısı eşittir" şeklinde çıktı vermesi.
TEST1:girdi sayı1:34 ,girdi sayı2:30 ,çıktı:34 sayısı, 30 sayısından büyüktür. 
TEST2:girdi sayı1:30 , girdi sayı2:30 ,çıktı:30 sayısı ile 30 sayısı birbirine eşittir.

PROJE 4:üç sayının en büyüğü
Beklenti:3 sayı alıp bu sayıların en büyüğünü(eğer 3'ü de eşitse hepsinin eşit olduğunu söyler ,o bir istisna) ve diğer iki sayının birbirine eşit olup olmadığını çıktı vermesidir.
TEST1:girdi sayı1:20 , girdi sayı2:30 ,girdi sayı3:40 , çıktı: 40 sayısı diğerlerinden daha büyüktür ayrıca 30 sayısı ile 20 sayısı eşit değildir.
TEST2:girdi sayı1:25 , girdi sayı2:25 ,girdi sayı3:40 , çıktı: 40 sayısı diğerlerinden daha büyüktür ayrıca 25 sayısı ile 25 sayısı eşittir.
TEST3:girdi sayı1:23 , girdi sayı2:23 ,girdi sayı3:23 , çıktı: Sayılar birbirine eşittir.

PROJE 5:not değerlendirme
Beklenti: Not değeri alıp ,eğer değer 90-100 aralığında ise AA,80-89 aralığında ise BA,70-79 aralığında ise BB,60-69 aralığında ise CB,50-59 aralığında ise CC,0-50 aralığında ise FF yazmasıdır,sınırlar da aralıklara dahildir.Ayrıca eğer not geçersizse (100'den büyük veya 0'dan küçük) bunu da belirtmeli.
TEST1:girdi not:73 , çıktı:BB
TEST2:girdi not:49 , çıktı:FF
TEST3:girdi not:153 , çıktı:girdiğiniz sayı 0 ile 100 arasında olmadığı için geçersiz sayılmıştır,uygun bir sayı giriniz.

PROJE 6:artık yıl kontrolü
Beklenti: Yıl değerini alıp eğer 4 'e bölünen ama 100'e bölünmeyen ya da bu iki sayıyı ek olarak 400'e de bölünen (zaten bu 2. ihtimal için sadece 400'ü kontrol etmek mantıken yeter.) bir sayı ise ".... yılı bir artık yıldır.",bu iki koşuldan hiçbirini sağlamayan bir sayı ise "... yılı artık yıl değildir." çıktısını vermesidir. 
TEST1:girdi yıl:2024 çıktı:2024 bir artık yıldır.
TEST2:girdi yıl:2000 çıktı:2000 bir artık yıldır.
TEST3:girdi yıl:1900 çıktı:1900 bir artık yıl değildir.

PROJE 7:3,5 bölünebilme
Beklenti:Bir sayı alıp eğer sayının 3'e bölümünden kalan 0 ama 5'e bölümünden kalan değilse "sayı 3'e tam bölünür ama 5'e tam bölünmez",eğer sayının  5'e bölümünden kalan 0 ama 3'e bölümünden kalan değilse "sayı 5'e tam bölünür ama 3'e tam bölünmez",eğer her ikisinden kalan da 0 ise "sayı hem 3'e hem 5'e ve dolayısıyla da 15'e tam bölünür.",eğer her ikisinden de kalan 0'dan başka bir sayı ise "sayı ne 3'e ne de 5'e tam bölünmez." yazmasıdır.
TEST1:girdi sayı:12, çıktı : sayı 3'e tam bölünür ama 5'e tam bölünmez
TEST2:girdi sayı:45, çıktı : sayı hem 3'e hem 5'e ve dolayısıyla da 15'e tam bölünür.
TEST3:girdi sayı:17 ,çıktı : sayı ne 3'e ne de 5'e tam bölünmez.

PROJE 8:basit hesap makinesi
Beklenti: Kullanıcıdan Yapılması istenen işlem bilgisini alıp , 2 sayı alıp, gerekli işlemi yapıp sonucu ekrana yansıtmak.Eğer bölme seçilir ve bölen 0 tayin edilir ise veya geçersiz bir işlem yapılmaya çalışılırsa "GEÇERSİZ BÖLEN/GEÇERSİZ İŞLEM İSTEĞİ" uyarılarından uygun olanı ekrana yazdırmak.(istek:1=toplama,2=çıkarma,3=çarpma,4=bölme olarak ayarlanmıştır.)
TEST1:girdi istek:1 , girdi sayı1:28 ,girdi sayı2:43 ,çıktı :71
TEST2:girdi istek : 4, girdi sayı1:33 ,girdi sayı2:0 ,çıktı: GEÇERSİZ BÖLEN

PROJE 9:üçgen tipi belirleme
Beklenti: Kullanıcıdan 3 kenar uzunluğu alınır. Sonra bu kenarların geometrik olarak bir üçgen oluşturup oluşturamadığı ölçülür ve eğer oluşturamayacaksa "Bu kenarlar bir üçgen oluşturamamaktadır." uyarısı verir. Eğer oluşturabilecekse kenarlar karşılaştırılır ve eşkenar üçgen mi ,ikizkenar mı yoksa çeşitkenar mı olduklarına göre çıktı verilir.
TEST1:girdi sayı1:10 ,girdi sayı2:15 ,girdi sayı3:39 ,çıktı:Bu kenarlar bir üçgen oluşturamamaktadır.
TEST2:girdi sayı1:21 ,girdi sayı2:24, girdi sayı3:30 , çıktı: Bu üçgen bir çeşitkenar üçgendir.
TEST3:girdi sayı1:23 ,girdi sayı2:23 , girdi sayı3:23 ,çıktı: Bu üçgen bir  eşkenar üçgendir.

PROJE 10:haftanın gününü numara ile belirleme
Beklenti: Kullanıcıdan bir numara alır. Numaranın 1'den 7'ye kadar herhangi bir sayıya eşit olup olmamasına ve daha da önemlisi herhangi birine eşitse hangisine eşit olduğuna göre belli bir günün adını ekrana yansıtır. Eğer hiçbirine eşit değilse "GEÇERSİZ SAYI,UYGUN DEĞİL " çıktısını ekrana yansıtır.
TEST1:girdi sayı :4 , çıktı:PERŞEMBE
TEST2:girdi sayı:16 , çıktı:GEÇERSİZ SAYI,UYGUN DEĞİL

NOT: Bu raporda bazı çıktılar ve girdiler ifade edilirken Java'nın dil duyarlılığı (Türkçe karaktere izin vermeme durumu) ,raporun daha akıcı ve rahat okunabilmesi amacıyla göz ardı edilmiştir.

NOT: Beklenti ve özellikle de test kısımlarında, raporun daha anlaşılabilir ve daha özet olması adına sadece temel bilgi ve işlemler üzerinde durulmuştur.

YANİ bu raporu daha çok "açıklayıcı bir ön rehber" gibi okumanız, asıl detayları ve orijinal kod satırlarını görmek için ise "ethoodev" dosyama göz atabilirsiniz.
























