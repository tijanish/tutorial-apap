 # Tutorial APAP
## Authors
*Tijani Putri Shabrina - 1906318174 - B*

## Tutorial 8
### Pertanyaan 1: 
Jawab:
> Setelah melakukan this.loadData(), statenya dikosongkan sehingga ketika modalnya dibuka field sudah kosong kembali.

### Pertanyaan 2: Jelaskan fungsi dari async dan await!

Jawab:
> Async/Await merupakan sebuah syntax khusus yang digunakan untuk bekerja dengan Promise agar lebih nyaman dan mudah untuk digunakan. Async/Await terbagi menjadi Async dan Await. Async merupakan sebuah fungsi yang mengembalikan sebuah Promise. Sedangkan Await merupakan fungsi yang hanya berjalan di dalam Async. Await bertujuan untuk menunda jalannya Async hingga proses dari Await tersebut berhasil dieksekusi.

### Pertanyaan 3: Masukkan jawaban dari Screenshot yang diperintahkan di halaman 9 pada Component Lifecycle pada pertanyaan ini.

Jawab:
> https://docs.google.com/document/d/1DWbDkBuSUEcilr9To3iXE-GQW50hMFhcKMUYtjBut3Y/edit?usp=sharing

### Pertanyaan 4: Jelaskan fungsi dari componentDidMount, shouldComponentUpdate, componentDidUpdate, componentWillReceiveProps, componentWillUnmount

Jawab:
> Funsi componentDidMount dipanggil ketika komponen selesai dibuat dan usecase yang menggunakan fungsi ini adalah ketika ingin mengetahui suatu komponen selesai dibuat. Fungsi shouldComponentUpdate dipanggil ketika property atau state dari komponen telah berubah dan usecase yang menggunakan fungsi ini adalah ketika ingin mengetahui perubahan porps/state dari komponen terkait. Fungsi componentDidUpdate dipanggil ketika sebelum atau sesudah komponen di render kembali dan usecase yang menggunakannya fungsi ini adalah ketika ada pekerjaan manual diluar react yang mengupdate si component. Fungsi componentWillReceiveProps dipanggil ketika komponen menerima props yang nilainya telah berubah dan usecase yang menggunakan fungsi ini adalah ketika mengubah si component. Fungsi componentWillUnmount dipanggil ketika ingin menghapus komponen dan usecase yang menggunakan fungsi ini adalah ketika ingin unsubscribe.
> 

## Tutorial 7
### Pertanyaan 1: Jelaskan apa yang Anda lakukan di latihan dalam satu paragraf per-soal. Berikan screenshot sebagai ilustrasi dari apa yang Anda jelaskan.

### Pertanyaan 2: Menurut pemahaman kamu selama pengerjaan tutorial ini, apa perbedaan antara state dan props?
Jawab:
> State merupakan sebuah data private dari sebuah component yang hanya tersedia untuk component tersebut
tanpa dapat diakses dari component lain. Sedangkankan props merupakan singkatan dari property yang merupakan sebuah
parameter dari fungsi component. Bentuk dari props menyerupai attribute pada tag HTML.   

### Pertanyaan 3: Menurut kamu, apakah sebaiknya kita menggunakan component (e.g. List, Item) dalam React? sebutkan alasannya.
Jawab:
> Ya, Karena dengan menggunakan component di React kita dapat membuat suatu code yang bisa direuse berkali-kali sesuai kebutuhan dan dapat dipanggil saja. 

### Pertanyaan 4: Apa perbedaan class component dan functional component?
Jawab:
>*Class Component alah jenis React komponen dengan syntax yang dapat dikatakan sebagai versi lama, sehingga lebih rumit dan panjang. Sedangkan, Function Component adalah jenis React component yang memiliki syntax yang lebih simple dan memungkinkan kita untuk menggunakan React Hooks.

### Pertanyaan 5: Dalam react, apakah perbedaan component dan element?
Jawab:
> Component memungkinkan untuk membagi User Interface (UI) menjadi bagian-bagian yang independen dan dapat digunakan kembali. Komponen seperti fungsi JavaScript. Mereka menerima input (Props) dan mengembalikan elemen React yang menggambarkan apa yang akan muncul di layar. Sedangkan elemen adalah bagian terkecil pada aplikasi React. Elemen menjelaskan apa yang ingin ditampilkan pada layar. 

## Tutorial 6
### Pertanyaan 1: Jelaskan secara singkat perbedaan Otentikasi dan Otorisasi! Di bagian mana (dalam kode yang telah anda buat) konsep tersebut diimplementasi?

Jawab:
> Otentikasi verifikasi apakah seseorang itu adalah proses memeriksa detail pengguna untuk mengidentifikasinya dan memberikan akses ke sistem. Biasanya melibatkan username dan password. Sedangkan otorisasi adalah proses memeriksa hak atau izin pengguna yang diotentikasi untuk mengakses sistem bagian spesifik.

> Berikut merupakan contoh implementasi otentifikasi pada class WebSecurityConfig: @Autowired public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{auth.userDetailsService(userDetailsService).passwordEncode(encoder());}

> Berikut merupakan contoh implementasi otorisasi pada class WebSecurityConfig: .authorizeRequests() .antMatchers("/css/").permitAll() .antMatchers("/js/").permitAll() .antMatchers("/hotel/").hasAuthority("RECEPTIONIST") .antMatchers("/user/addUser").hasAuthority("ADMIN") .antMatchers("/kamar/add/").hasAuthority("RECEPTIONIST")

### Pertanyaan 2: Apa itu BCryptPasswordEncoder? Jelaskan secara singkat cara kerjanya!

Jawab:
> BCryptPasswordEncoder adalah sebuah fungsi hashing untuk mengenkripsi password sehingga password tidak diketahui dan dilihat dalam sebuah databse. BCryptPasswordEncoder meng-encrypt String Raw menjadi String yang sudah di acak agar tidak mudah diketahui.

### Pertanyaan 3: Apakah penyimpanan password sebaiknya menggunakan encryption atau hashing? Mengapa demikian?

Jawab:
> Penyimpanan password sebaiknya menggunakan encryption agar kemanan lebih terjaga.

### Pertanyaan 4: Jelaskan secara singkat apa itu UUID beserta penggunaannya!

Jawab:
> Universally Unique Identifier (UUID) berguna untuk mengidentifikasi beberapa objek atau entitas secara unik di Internet. Terdapat beberapa mekanisme spesifik yang digunakan, UUID dijamin berbeda atau, paling tidak, sangat mungkin berbeda dari UUID lain yang ada. UUID dapat digunakan untuk meningkatkan keamanan data user karenakan id user akan digenerate secara unik dengan hashing sebanyak 32 karakter acak sehingga id user aman dan tidak dengan mudah dapat untuk diretas.

### Pertanyaan 5: Apa kegunaan class UserDetailsServiceImpl.java? Mengapa harus ada class tersebut padahal kita sudah memiliki class UserRoleServiceImpl.java?

Jawab: 
> UserDetailsService adalah interface inti dalam kerangka kerja Spring Security. UserDetailsService digunakan untuk mengambil informasi otentikasi dan otorisasi pengguna yang memiliki metode baca-saja tunggal bernama loadUserByUsername() yang berguna untuk mencari pengguna berdasarkan nama pengguna.



## Tutorial 5
### Pertanyaan 1: 
Apa itu Postman? Apa kegunaannya?

Jawab:
> Postman merupakan aplikasi yang berfungsi sebagai REST Client dimana dapat digunakan untuk uji REST API.  Postman Interceptor merupakan extension pada Chrome yang dapat merekam network request dari Chrome yang kemudian disimpan pada aplikasi postman. Pada postman terdapat berbagai method yang dapat kita gunakan seperti Method GET menampilkan data dan menambahkan URI yang nantinya ditampung  pada action dan Method POST mengirimkan data langsung kepada action tanpa melalui URI sehingga method ini bersifat uncacheable ( tidak dapat disimpan pada cache).

### Pertanyaan 2: 
Jelaskan fungsi dari anotasi @JsonIgnoreProperties dan @JsonProperty.

Jawab:
> @JsonIgnoreProperties digunakan untuk menekan serialisasi properti atau mengabaikan pemrosesan properti JSON yang dibaca saat deserialisasi.eserialization JSON. Hal ini dapat memudahkan kita untuk panggilan REST dan menghasilkan objek domain.
@JsonProperty digunakan untuk memetakan nama properti dengan kunci JSON selama serialisasi dan deserialisasi. Secara default, saat membuat serialisasi POJO, JSON yang dihasilkan akan memiliki kunci yang dipetakan ke bidang POJO. 
	
### Pertanyaan 3:
Apa kegunaan atribut WebClient?

Jawab:
> WebClient digunakan untuk TravelAgensiRestServiceImpl yang digunakan untuk mengirim serta menerima data dari resource URI. akses diberikan pada webrequest class/

### Pertanyaan 4:
Apa itu ResponseEntity dan BindingResult? Apa kegunaannya?

Jawab:
> ResponseEntity berfungsi untuk mewakili seluruh respons HTTP dan beperan dalam mengikonfigurasi response HTTP secara keseluruhan. sedangkan BindingResult berisi informasi mengenai kesalahan, misalkan field yang diperlukan, adanya ketidakcocokan jenis atau kesalahan dalam melakukan pemanggilan method.

	

## Tutorial 2
### Pertanyaan 1: 
Cobalah untuk menambahkan sebuah Agensi dengan mengakses link berikut:
http://localhost:8080/agensi/add?idAgensi=1&namaAgensi=Papa%20APAP&alamat=Maung%20Fasilkom&noTelepon=081xxx Apa yang terjadi? Jelaskan mengapa hal tersebut dapat terjadi

Jawab:
>Saya mengalami error pada page tersebut ketika URL tersebut dipanggil URL tersebut belum ada karena pada tahap ini saya belum memiliki add-agensi.html.

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
