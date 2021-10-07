# Fuzzy_Logic - Bulanık Mantık

# Özet
Seçilen veri setinin bulanık modelini oluşturmak amacı ile üye fonksiyonlarını oluşturmak,
verilere göre durulama metodunu seçip kural yazmak ve modelin hata değerini ödev dokümanında belirtilen hata değerine indirgemek. 
Çıktıları ve hata yüzdesini ekrana yazdırıp fonksiyonları çizdirmek.

# Geliştirilen Yazılım
İlk data setini seçtim. https://archive.ics.uci.edu/ml/datasets/Blood+Transfusion+Service+Center
Seçtiğim veri seti belirli kriterler göre insanların belirtilen tarihte kan verip, vermeme durumu 
incelemekte. Veri setini ilk indirdiğimde Recency (months),Frequency (times),Monetary (c.c. blood) ve 
sonuç bulunmaktaydı. 
Her kan alındığında 250 c.c. kan alındığı için Monetary alanı ile Frequency alanı sonuçu hep aynı şekilde 
etkiledi yani korelasyonları eşitti ve Monetary alanını sildim. Bu durumda recency, frequency ve time 
olmak üzere üç girişim kaldı.
Hemen ardından excelden yararlanarak her bir girişim grafiklerini oluşturdum ve bu grafiklerden kırılım 
noktalarınnı belirledim. Belirlediğim kırılım noktalarına göre model.fcl dosyama gelip üye 
fonksiyonlarımı yazdım.
Kartezyen çarpım yardımı ile üye fonksiyonlarım yararlanarak kuralları yazdım kural sonuçlarını 
excelden yararlanark belirledim. Örneğin frekans cok_fazla recency az ve time eski ile excele gelip 
sınırlarını belirledim verir veya vermez çıkışlarını yani sıfır ve bir sayıları sayıp fazla olan sayıya göre 
verir vermez hesabı yaptım.
Kurallarımmı yazdıktan sonra derste yaptığımız gibi fis dosyamı oluşturdum. Bu dosya sonuç hesaplanır 
ve getSonucD fonksiyonu ile gönderilir.
getSonuc fonksiyonunda ise hesaplanan değere göre 1 ise true 0 ise false döndür.
csvReaderda satır satır okuyup bir listeye atar ve BloodOutputModel.java’sı dosyasını hesaplanan çıktı 
ve asıl çıktıyı gönderir.
BulanikOdev_1 dosyasında main metodu bulunur içinde hesaplanan çıktıyı, asıl çıktı ve değerleri ekrana 
yazdırır.
Hata hesabını mapeye göre yapar.
Çıktılarım 0 ve 1 olması gerektiği ve 0 bölünün olamayacağı için bölünen değer 1 kabul edilip hesaplanır. 
Ve ekrana yazdırıp. Üye fonsiyonları ve grafikleri çizdirdim.

# Rastgele bir veri için üye fonksiyonu eklendi.
![1](https://user-images.githubusercontent.com/61979226/136330760-546e43a8-0976-4027-ba48-125c058877c9.png)

# Çıktı Örnekleri
![2](https://user-images.githubusercontent.com/61979226/136330818-f541fbd7-927f-4ad6-9fe3-a60dcc27d8e7.png)

# The mean absolute percentage error (MAPE)
![3](https://user-images.githubusercontent.com/61979226/136330887-bc2e67ff-922c-438a-af5a-e03b70abe432.png)




