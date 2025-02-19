
Proje Özeti:

Bu web uygulaması, kullanıcıların sosyal medya benzeri bir platformda etkileşimde bulunabilecekleri bir sistem sunmaktadır. 
Java, Spring Boot, React, MySQL ve Hibernate kullanarak geliştirilmiştir. 
Uygulamanın amacı, kullanıcıların kolayca kayıt olup giriş yapabilmesini sağlamak, içeriklerini paylaşmalarına ve başkalarıyla etkileşimde bulunmalarına olanak tanımaktır.
Henüz geliştirilmesi gereken noktalar olsa da bu aşamada projenin GitHub'ta paylaşılmasının faydalı olacağına karar verdim.

Özellikler:

•	Kullanıcı Kaydı ve Girişi: Kullanıcılar, sisteme kayıt olabilmekte ve giriş yapabilmektedir. Giriş için JWT Token tabanlı kimlik doğrulama yöntemi kullanılmaktadır. 
•	Post Sistemi: Kullanıcılar kendi postlarını oluşturabilir, düzenleyebilir ve silebilirler. Ayrıca, diğer kullanıcıların postlarına like (beğeni) gönderebilirler.
•	Yorum Sistemi: Kullanıcılar, başkalarının paylaştığı postlara yorum yapabilir.
•	Kullanıcı Profili ve Avatar: Kullanıcılar, hesap ekranlarında profil fotoğraflarını (avatarlarını) seçebilirler. Ayrıca, kendi aktivitelerini (paylaşımlarını ve yorumlarını) görüntüleyebilirler.

Kullanılan Teknolojiler:

•	Backend: Java 17, Spring Boot, Hibernate, Lombok, MySQL
•	Frontend: React
•	Veritabanı: MySQL
•	Güvenlik: JWT Token Authentication (HS512 ile şifreleme)

Projenin Çalıştırılması :
- Backend’i Çalıştırma
1.	MySQL Veritabanını Ayarla, application.properties içinde veritabanı bilgilerini kendi ayarlarına göre düzenle.
2.	Backend’i Başlat
	API, http://localhost:8080 üzerinden çalışacaktır.
- Frontend’i Çalıştırma
1.	Bağımlılıkları Yükle; Terminal de; npm install 
2.	Frontend’i Başlat; npm start
	React uygulaması http://localhost:3000 adresinde çalışacaktır.

Proje Bağlantıları :
•	Backend Repo: [post-app-backend](https://github.com/OZNURKUTLU/post-app-backend)
•	Frontend Repo: [post-app-frontend](https://github.com/OZNURKUTLU/post-app-frontend)

Ekran Görüntüleri :

![image](https://github.com/user-attachments/assets/cc3d3a3e-0ce5-44bd-80dd-3e2f73e41080)
![image](https://github.com/user-attachments/assets/59cdf4af-925a-4d84-8603-29882374a2f0)
![image](https://github.com/user-attachments/assets/7aca5515-06a3-4f79-bb34-77952b16ec7f)
![image](https://github.com/user-attachments/assets/e2130e7c-f10b-491c-89e6-1ab645e314e0)
![image](https://github.com/user-attachments/assets/f601f9b4-b18e-4315-9463-8c1e146d9de4)
![image](https://github.com/user-attachments/assets/bbab139e-0945-4be4-8adb-7ad45dd07ff9)
![image](https://github.com/user-attachments/assets/7c42a49f-bfd6-4434-acd4-2e6dcc1e18e9)
![image](https://github.com/user-attachments/assets/2ab68b8f-b3d5-4ff9-8af3-b3213bd55305)










