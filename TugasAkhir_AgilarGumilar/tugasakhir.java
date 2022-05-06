import java.util.Scanner;

public class tugasakhir {
    static Scanner lulScanner = new Scanner(System.in);
    static double bil1;
    static double bil2;
    static double bil3;
    static char operator;
    static boolean step5;
    static boolean step2;

    static String username;
    static String[] dataStatusPinjaman;
    static double[][] paketArray ;
    static int p;
    static int statusPinjaman;

    public static void nama() {
        String username;
        String pin;
        String[] databaseUsername = { "agilar", "mira", "Anjaychichak", "Nobody", "Ziedd", "Haii", "alizul", "crimson",
                "Ken", "Edwin", "Arhan", "ranskuyy", "Bismilahsmstr1aman", "peminjamNakal" };
        String[] databasePin = { "101102", "545454", "123456", "000000", "705828", "Specialpaketelor", "230193",
                "cr135017", "051015", "00100111", "356465", "101010", "Bismilahsmstr1aman", "111111" };

        int coba = 1;
        int anggota = 0;
        int lanjut = 0;
        boolean password = true;
        boolean password2 = true;
        boolean kondisi = true;
        boolean kondisi3 = true;
        int kondisi2 = 0;
        Scanner sc = new Scanner(System.in);
        while (kondisi) {
            while (coba == 1) {
                System.out.println(
                        "-------------------------------------------------------------------------------------------");
                System.out.println("Selamat Datang di koperasi");
                System.out.println("       Anggota Makmur     ");
                System.out.println(
                        "-------------------------------------------------------------------------------------------");
                System.out.println("Silahkan Masukkan username anda");
                username = sc.next();
                System.out.println(
                        "-------------------------------------------------------------------------------------------");
                if (username.equals(databaseUsername[0])) {
                    p = 0;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[0])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                }

                else if (username.equals(databaseUsername[1])) {
                    p = 1;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[1])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[2])) {
                    p = 2;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[2])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[3])) {
                    p = 3;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[3])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[4])) {
                    p = 4;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[4])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;
                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[5])) {
                    p = 5;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[5])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[6])) {
                    p = 6;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[6])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[7])) {
                    p = 7;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[7])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[8])) {
                    p = 8;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[8])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[9])) {
                    p = 9;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[9])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[1])) {
                    p = 10;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[10])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[11])) {
                    p = 11;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[11])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[12])) {
                    p = 12;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[12])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                } else if (username.equals(databaseUsername[13])) {
                    p = 13;
                    password2 = true;
                    password = true;
                    kondisi = true;
                    while (password) {
                        System.out.println("silahkan masukkan pin anda");
                        pin = sc.next();
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        if (pin.equals(databasePin[13])) {
                            password = false;
                            kondisi = false;
                            coba = 2;
                            kondisi3 = false;

                        } else {
                            coba = 1;
                            System.out.println("Mohon maaf pin anda salah ");
                            while (password2) {
                                System.out.println(
                                        "ketik 0 untuk keluar, 1 untuk mengulangi pin anda, dan 2 untuk kembali ke halaman awal");
                                lanjut = sc.nextInt();
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                if (lanjut == 0) {
                                    System.exit(lanjut);
                                } else if (lanjut == 1) {
                                    break;
                                } else if (lanjut == 2) {
                                    password2 = false;
                                    password = false;
                                    break;
                                } else {
                                    System.out.println(
                                            "Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                                    continue;
                                }
                            }

                        }
                    }

                }
                while (kondisi3) {
                    System.out.println("Username anda salah,silahkan mengisi kembali");
                    System.out.println(
                            "-------------------------------------------------------------------------------------------");
                    System.out.println("Ketik 0 untuk keluar\nKetik 1 untuk mengulangi");
                    kondisi2 = sc.nextInt();
                    if (kondisi2 == 0) {
                        System.exit(kondisi2);
                    } else if (kondisi2 == 1) {
                        break;
                    } else {
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        System.out.println("Operator yang Anda masukkan salah,Silahkan masukkan ulang operator");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");

                    }
                }

            }
        }
    }

    static double paketPinjaman(Double bil1, Double bil2) {
        Scanner lulScanner = new Scanner(System.in);

        if (bil1 > 499999 && bil1 <= 1000000) {
            bil3 = (bil1 / 100) * 105;
        } else if (1000000 < bil1 && bil1 <= 2000000) {
            bil3 = (bil1 / 100) * 106;
        } else if (2000000 < bil1 && bil1 <= 3000000) {
            bil3 = (bil1 / 100) * 107;
        } else if (3000000 < bil1 && bil1 <= 4000000) {
            bil3 = (bil1 / 100) * 108;
        } else if (4000000 < bil1 && bil1 <= 5000000) {
            bil3 = (bil1 / 100) * 109;
        } else if (bil1 > 5000000 && bil1 < 20000001) {
            bil3 = (bil1 / 100) * 110;
        } else {

            System.out.println("Mohon maaf jumlah pinjaman anda tidak bisa kami akomodir");
            System.out
                    .println("Peminjaman yang dapat diakomodir adalah pinjaman bernilai antara Rp.500000-Rp.20000000");
            System.out.println(
                    "-------------------------------------------------------------------------------------------");
            // step5=true;
        }
        return bil3;

    }
    public static void statusPinjam() {
        String[] dataStatusPinjaman = { "lunas", "lunas", "lunas", "lunas", "lunas", "lunas", "lunas", "lunas", "lunas",
                "lunas", "lunas", "lunas", "lunas", "Sedang dalam pinjaman" };
        if (dataStatusPinjaman[p].equalsIgnoreCase("lunas")) {
            System.out.println(
                    "Anda tidak memiliki tanggungan pinjaman.Silahkan pilih opsi peminjaman yang anda inginkan :");
        } else {
            System.out.println(
                    "Mohon maaf silahkan melunasi pinjaman anda sebelum melakukan peminjaman baru\nSilahkan ketik angka apa saja untuk keluar dari program");
            statusPinjaman = lulScanner.nextInt();
            switch (statusPinjaman) {
                case '1':
                    System.out.println("Terimakasih telah menggunakan jasa kami");
                    System.out.println(
                            "-------------------------------------------------------------------------------------------");
                    System.exit(statusPinjaman);

                    break;

                default:
                    System.out.println("Terimakasih telah menggunakan jasa kami");
                    System.out.println(
                            "-------------------------------------------------------------------------------------------");
                    System.exit(statusPinjaman);
                    break;
            }
        } 
    }

    public static void opsiPinjaman() {
        double[][] paketArray = { { 1000000, 12, 1050000 },
                { 2000000, 12, 2120000 },
                { 3000000, 12, 3210000 },
                { 4000000, 12, 4320000 },
                { bil1, bil2, bil3 } };
        System.out.println("Pilihan opsi peminjaman");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 1");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Jumlah pinjaman\t= " + "Rp." + (int) paketArray[0][0] + "\nJumlah angsuran\t= "
                + (int) paketArray[0][1] + " bulan "
                + "\nTotal pembayaran= " + "Rp." + (int) paketArray[0][2] + "/bulan");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 2");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Jumlah pinjaman\t= " + "Rp." + (int) paketArray[1][0] + "\nJumlah angsuran\t= "
                + (int) paketArray[1][1] + " bulan "
                + "\nTotal pembayaran= " + "Rp." + (int) paketArray[1][2] + "/bulan");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 3");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Jumlah pinjaman\t= " + "Rp." + (int) paketArray[2][0] + "\nJumlah angsuran\t= "
                + (int) paketArray[2][1] + " bulan "
                + "\nTotal pembayaran= " + "Rp." + (int) paketArray[2][2] + "/bulan");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 4");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Jumlah pinjaman\t= " + "Rp." + (int) paketArray[3][0] + "\nJumlah angsuran\t= "
                + (int) paketArray[3][1] + " bulan "
                + "\nTotal pembayaran= " + "Rp." + (int) paketArray[3][2] + "/bulan");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 5");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Silahkan input sendiri jumlah pinjaman dan jumlah angsuran");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Opsi 6");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.println("Silahkan pilih untuk membatalkan pinjaman");
        System.out.println(
                "-------------------------------------------------------------------------------------------");
        System.out.print("silahkan pilih paket : ");
        operator = lulScanner.next().charAt(0);
        System.out.println(
                "-------------------------------------------------------------------------------------------");

        switch (operator) {

            case '5':
                System.out.print("Masukkan jumlah pinjaman = ");
                bil1 = lulScanner.nextDouble();
                System.out.print("Masukkan jumlah angsuran = ");
                bil2 = lulScanner.nextDouble();
                paketPinjaman(bil1, bil2);
                if (bil1 > 499999 && bil1 < 20000001) {
                    step2 = false;
                } else {

                }
                break;
            case '1':
                bil1 = paketArray[0][0];
                bil2 = paketArray[0][1];
                bil3 = paketArray[0][2];
                step2 = false;
                break;
            case '2':
                bil1 = paketArray[1][0];
                bil2 = paketArray[1][1];
                bil3 = paketArray[1][2];
                step2 = false;
                break;
            case '3':
                bil1 = paketArray[2][0];
                bil2 = paketArray[2][1];
                bil3 = paketArray[2][2];
                step2 = false;
                break;
            case '4':
                bil1 = paketArray[3][0];
                bil2 = paketArray[3][1];
                bil3 = paketArray[3][2];
                step2 = false;
                break;
            case '6':
                System.out.println(
                        "transaksi telah kami batalkan,terimakasih telah mengunakan jasa kami");
                System.out.println(
                        "-------------------------------------------------------------------------------------------");
                System.exit(operator);
            default:
                System.out.println(
                        "Operator yang anda masukkan tidak valid,silahkan ulangi operator,silahkan pilih ulang Opsi pinjaman");
        }
        
    }
    public static void main(String[] args) {

        Scanner lulScanner = new Scanner(System.in);
        
        String[] databaseUsername = { "agilar", "mira", "Anjaychichak", "Nobody", "Ziedd", "Haii", "alizul", "crimson",
                "Ken", "Edwin", "Arhan", "ranskuyy", "Bismilahsmstr1aman", "peminjamNakal" };
        boolean jawab2 = true;
        boolean step2 = true;
        boolean step3 = true;
        boolean step4 = true;
        boolean step5 = true;
        char operator;
        char jawab;
        char jawab3;
        nama();
        statusPinjam();
        opsiPinjaman();
        while (step5) {
            while (step2) {
                step2 = true;
                step3 = true;
                step5 = true;
                step4 = true;
                step5 = true;
               
            }
            step2 = true;
            step3 = true;
            System.out.println("Kami akan mengkonfirmasi pinjaman anda");
            System.out.println(
                    "-------------------------------------------------------------------------------------------");
            System.out.println("Pinjaman atas nama      = " + databaseUsername[p]);
            System.out.println("Anda meminjam sejumlah  = " + "Rp." + (int) bil1);
            System.out.println("Dengan banyak angsuran  = " + (int) bil2 + " Bulan");
            System.out.println("Dengan total pembayaran = " + "Rp." + (int) bil3 + " atau " + "Rp."
                    + (int) bil3 / (int) bil2 + "/bulan ");
            System.out.println(
                    "-------------------------------------------------------------------------------------------");
            while (step3) {
                step2 = true;
                jawab2 = true;
                System.out.println(
                        "Apakah anda ingin melakukan perpanjangan angsuran ?\nketik 1 untuk memperpanjang/memperpendek angsuran\nketik 2 untuk melanjutkan proses\nketik 3 untuk membatalkan pinjaman\nketik 4 untuk memilih paket pinjaman yang lain");
                System.out.print("Masukkan pilihan anda : ");
                jawab = lulScanner.next().charAt(0);
                System.out.println(
                        "-------------------------------------------------------------------------------------------");
                switch (jawab) {
                    case '1':
                        while (jawab2) {
                            step4 = true;
                            // System.out.print("Masukkan jumlah pinjaman : ");
                            // bil1 = lulScanner.nextDouble();
                            System.out.print("Masukkan banyak angsuran yang baru : ");
                            bil2 = lulScanner.nextDouble();
                            paketPinjaman(bil1, bil2);
                            System.out.println("Anda meminjam sejumlah " + (int) bil1);
                            System.out.println("Dengan banyak angsuran = " + (int) bil2);
                            System.out.println("Dengan total pembayaran " + (int) bil3 / (int) bil2 + " /bulan");
                            System.out.println(
                                    "-------------------------------------------------------------------------------------------");

                            while (step4) {
                                System.out.println(
                                        "ketik 0 untuk mengubah angsuran\nketik 1 untuk melanjutkan proses\nketik 2 untuk membatalkan peminjaman ");
                                System.out.print("Masukkan pilihan anda : ");
                                jawab3 = lulScanner.next().charAt(0);
                                System.out.println(
                                        "-------------------------------------------------------------------------------------------");
                                switch (jawab3) {
                                    case '0':
                                        break;
                                    case '1':
                                        jawab2 = false;
                                        step2 = false;
                                        step3 = false;
                                        step4 = false;
                                        break;
                                    case '2':
                                        System.out.println(
                                                "transaksi telah kami batalkan,terimakasih telah mengunakan jasa kami");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------");
                                        System.exit(jawab3);
                                        break;
                                    default:
                                        System.out.println(
                                                "Operator yang anda masukkan tidak valid,silahkan ulangi operator");
                                        System.out.println(
                                                "-------------------------------------------------------------------------------------------");
                                        break;
                                }

                            }
                        }
                        break;
                    case '2':
                        step5 = false;
                        step3 = false;
                        break;
                    case '3':
                        System.out.println("transaksi telah kami batalkan,terimakasih telah mengunakan jasa kami");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        System.exit(jawab);
                        break;
                    case '4':
                        step3 = false;
                        break;

                    default:
                        System.out.println("Operator yang anda masukkan tidak valid,silahkan ulangi operator");
                        System.out.println(
                                "-------------------------------------------------------------------------------------------");
                        break;
                }

            }
        }
        System.out.println(
                "Pengajuan anda sudah kami proses\nterimakasih telah mengunakan jasa kami dan silahkan menunggu informasi lebih lanjut");
        System.out
                .println("-------------------------------------------------------------------------------------------");

    }
}
