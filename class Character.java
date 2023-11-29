/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166034.pbo.lat59;

* Nama         : Nur Hidayah
* NIM          : 22166034 
* Mata Kuliah  : PBO 
* Prodi        : Sistem Informasi
// Semester 3

// Kelas Utama
class Character {
    protected String name;
    protected String occupation;

    public Character(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + ". I am a " + occupation + ".");
    }
}

// Kelas Turunan 1
class DetectiveConanCharacter extends Character {
    protected String skill;

    public DetectiveConanCharacter(String name, String occupation, String skill) {
        super(name, occupation);
        this.skill = skill;
    }

    public void performSkill() {
        System.out.println(name + " performs " + skill + ".");
    }
}

// Kelas Turunan 2
class MainCharacter extends DetectiveConanCharacter {
    private String mainCharacterAttribute;

    public MainCharacter(String name, String occupation, String skill, String attribute) {
        super(name, occupation, skill);
        this.mainCharacterAttribute = attribute;
    }

    public void doMainCharacterAction() {
        System.out.println(name + " does something special: " + mainCharacterAttribute);
    }
}

// Kelas Turunan 3
class SupportingCharacter extends DetectiveConanCharacter {
    private String supportingCharacterAttribute;

    public SupportingCharacter(String name, String occupation, String skill, String attribute) {
        super(name, occupation, skill);
        this.supportingCharacterAttribute = attribute;
    }

    public void doSupportingCharacterAction() {
        System.out.println(name + " does something supportive: " + supportingCharacterAttribute);
    }
}

// Program Utama
class DetectiveConan {
    public static void main(String[] args) {
        // Contoh penggunaan inheritance dan polimorfisme
        MainCharacter conan = new MainCharacter("Conan Edogawa", "Detective", "Detective Skills", "Smart deductions");
        SupportingCharacter haibara = new SupportingCharacter("Ai Haibara", "Scientist", "Chemistry Skills", "Providing insights");

        conan.introduce();
        conan.performSkill();
        conan.doMainCharacterAction();

        System.out.println();

        haibara.introduce();
        haibara.performSkill();
        haibara.doSupportingCharacterAction();
    }
}
