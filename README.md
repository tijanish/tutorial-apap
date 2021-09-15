# Tutorial APAP
## Authors
* **<Tijani Putri Shabrina>** - *<1906318174>* - *<B>*
 
## Tutorial 2
### Pertanyaan 1: 
Cobalah untuk menambahkan sebuah Agensi dengan mengakses link berikut:
http://localhost:8080/agensi/add?idAgensi=1&namaAgensi=Papa%20APAP&alamat=Maung%20Fasilkom&noTelepon=081xxx Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi

Jawab:
>Saya mengalami error pada page tersebut ketika URL tersebut dipanggil URL tersebut belum ada karena pada tahap ini saya belum memiliki view.

### Pertanyaan 2: 
Menurut kamu anotasi @Autowired pada class Controller tersebut
merupakan implementasi dari konsep apa? Dan jelaskan secara singkat cara kerja
@Autowired tersebut dalam konteks service dan controller yang telah kamu buat

Jawab:
>Anotasi @Autowired memberikan kontrol yang lebih smooth tentang bagaimana dan di mana autowiring harus dilakukan yang pada controller dan service menghubungkan pada metode settter, getter, dan constructure.
	
### Pertanyaan 3:
Cobalah untuk menambahkan sebuah Agensi dengan mengakses link berikut:
http://localhost:8080/agensi/add?idAgensi=1&namaAgensi=Papa%20APAP&alamat=Maung%20Fasilkom Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi
	
Jawab:
Muncul hite Label Error Page dengan error (type=Bad Request, status=400), karena kekurangan parameter yaitu parameter "noTelepon". Hal tesrsebut error karena ketika membuat model, parameter tersebut disetting required.

### Pertanyaan 4:
Jika Papa APAP ingin melihat Travel Agensi dengan nama Papa APAP, link apa yang harus diakses?
	
Jawab:
> http://localhost:8080/agensi/viewAll 

### Pertanyaan 5:
Tambahkan 1 contoh Travel Agensi lainnya sesukamu. Lalu cobalah
untuk mengakses http://localhost:8080/agensi/viewAll , apa yang akan ditampilkan?
Sertakan juga bukti screenshotmu.

Jawab:

>Ditampilkan Agensi buatan sesukaku.
![image](https://user-images.githubusercontent.com/90309133/133431970-bf0a970f-ce9d-4724-b430-eca1d0934644.png)

	
	

## Tutorial 1

### What I have learned today
Pada tutorial 1, saya mempelajari soal git dan membuat architectural pattern yaitu Model-View-Controller (MVC). Saya mempelajari bahwa membuat Model dan Controller dengan membuat package. View dibuat di file html dengan penggunaan Thymeleaf.

### Github
1. Apa itu Issue Tracker? Apa saja masalah yang dapat diselesaikan dengan Issue Tracker?
	> Issue Tracker adalah sebuat fitur yang membuat kita dapat 	menyimpan dan mengikuti issue-issue yang diidetifikasi oleh developer sampai issue bisa teratasi.

	>Masalah yang dapat diatasi adalah seperti Bug, Invalid Code, Feature Request, Internal Cleanup dan Duplicate Pull Request.

2. Apa perbedaan dari git merge dan git merge --squash?
	> Semua history commit pada git merge dari setiap branch akan 	ditambahkan kedalam branch utama atau master saat merge commit. Sedangkan commit dari setiap pull request pada merge --squash akan digabungkan jadi single commit.

3. Apa keunggulan menggunakan Version Control System seperti Git dalam pengembangan
suatu aplikasi?
	> Dapat digunakan sebagai Alat Perencanaan sehingga dapat merencanakan suatu kegiatan dan menetapkan pekerjaan kepada anggota tim. Jadwal dapat diatur sendiri dan ini semua diperoleh dari Git dan/atau GitHub.

### Spring
4. Apa itu library & dependency?
	>Library adalah kumpulan kelas yang memiliki fungsi yang sama dan dikumpulkan jadi satu agar penggunaannya lebih mudah di projek-projek selanjutnya.
	>Dependency adalah library eksternal Java yang digunakan untuk suatu proyek.

5. Apa itu Maven? Mengapa kita menggunakan Maven? Apakah ada alternatif dari Maven?
	>Maven adalah tool yang digunakan untuk build pada Java. Terdapat 2 aspek pada maven dalam membangun software, yaitu mendeskripsikan bagaimana software dibangun dan mendeskripsikan dependensinya. Maven dapat digunakan untuk mengelola proyek yang ditulis dengan bahasa pemrograman lainnya seperti C#, Ruby, Scala, dan lainnya.
	>Agar struktur direktori setiap orang yang berbeda dapat mengikuti 	standar project template yang sudah ada. Pengunaan mavendapat 	membuat 1 buah archetype untuk 1 jenis proyek. Maven juga dapat 	digunakan untuk mengelola dependency sehingga programmer dapat 	dengan mudah menambahkan library yang ingin digunakan. Maven juga membantu kita dalam portability project yang memungkinkan kita untuk 	membuka project dengan IDE apapun.
	>Gradle, Jenkins, Teamwork, dsb.

6. Selain untuk pengembangan web, apa saja yang bisa dikembangkan dengan Spring framework?
	>Dengan Spring framework, pembaca bisa mengembangkan aplikasi enterprise.

7. Apa perbedaan dari @RequestParam dan @PathVariable? Kapan sebaiknya
menggunakan @RequestParam atau @PathVariable?
	>@PathVariable adalah digunakan untuk mendapatkan tempat penampung dari URI (Spring menyebutnya sebagai Templat URI) dan dapat digunakan saat RequestMethod
	>@RequestParamadalah digunakan untuk mendapatkan parameter dari URI

### What I did not understand
1. Belum paham framework yang tersedia dalam Springboot
2. Belum mengerti flow springboot

