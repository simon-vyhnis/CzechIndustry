import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {
    private List<Factory> citiesAndFactories;
    private Data(){
        citiesAndFactories = new ArrayList<>();
        //Hutnický
        citiesAndFactories.add(new Factory("Vítkovice steel","hutnický","Ostrava"));
        citiesAndFactories.add(new Factory("Třinecké železárny","hutnický", "Třinec"));
        citiesAndFactories.add(new Factory("Výroba hliníku","hutnický","Břidličná na Bruntálsku"));
        //Chemický
        citiesAndFactories.add(new Factory("Zentiva","chemický-farmacie", "Praha"));
        citiesAndFactories.add(new Factory("Farmak","chemický-farmacie","Olomouc"));
        citiesAndFactories.add(new Factory("Synthos","chemický-ropa","Kralupy nad Vltavou"));
        citiesAndFactories.add(new Factory("Spolana","chemický-ropa", "Neratovice"));
        citiesAndFactories.add(new Factory("Unipetrol","chemický-ropa", "Litvínov"));
        citiesAndFactories.add(new Factory("Lovochemie","chemický-hnojiva", "Lovosice"));
        citiesAndFactories.add(new Factory("Explosia","Pardubice", "chemický-semtex"));
        citiesAndFactories.add(new Factory("Barum Continental","chemický-pneumatiky", "Otrokovice"));
        citiesAndFactories.add(new Factory("Paramo","chemický-asfalty a oleje", "Pardubice"));
        citiesAndFactories.add(new Factory("Procter and Gamble","chemický-drogerie", "Rakovník"));
        citiesAndFactories.add(new Factory("Spolchemie","chemický-sloučeniny", "Ústí nad Labem"));
        citiesAndFactories.add(new Factory("Fatra","chemický-PVC", "Napajedla"));
        //Stavebních hmot
        citiesAndFactories.add(new Factory("Cementárny","stavebních hmot", "Brno"));
        citiesAndFactories.add(new Factory("Cementárny","stavebních hmot", "Chrudim"));
        //Těžké strojírenství
        citiesAndFactories.add(new Factory("Sigma","těžké strojírenství", "Olomouc"));
        citiesAndFactories.add(new Factory("Škoda","těžké strojírenství, investiční strojírenství, vlaky", ""));
        citiesAndFactories.add(new Factory("ČKD group","těžké a investiční strojírenství", "Praha-Kolbenova"));
        citiesAndFactories.add(new Factory("ŽĎAS","těžké strojírenství", "Žďár nad Sázavou"));
        //Všeobecné strojírenství
        citiesAndFactories.add(new Factory("Škoda Auto","dopravní strojírenství", "Mladá Boleslav, Vrchlabí"));
        citiesAndFactories.add(new Factory("Tatra","všeobecné strojírenství", "Kopřivnice"));
        citiesAndFactories.add(new Factory("IVECO","dopravní strojírenství", "Vysoké Mýto"));
        citiesAndFactories.add(new Factory("Zetor","všeobecné strojírenství", "traktory"));
        citiesAndFactories.add(new Factory("Montovny Hyundai a Kia","dopravní strojírenství", "Nošovice"));
        citiesAndFactories.add(new Factory("Montovny TPCA","dopravní strojírenství", "Ovčáry u Kolína"));
        citiesAndFactories.add(new Factory("Avia","všeobecné strojírenství", "Praha-Letňany"));
        citiesAndFactories.add(new Factory("Jawa","všeobecné strojírenství", "Týnec nad Sázavou"));
        citiesAndFactories.add(new Factory("Let vrtulníky","všeobecné strojírenství", "Kunovice"));
        citiesAndFactories.add(new Factory("Aero letadla","všeobecné strojírenství", "Vodochody"));
        //Lehké strojírenství
        citiesAndFactories.add(new Factory("ETA","lehké strojírenství-kuchyňské spotřebiče", "Hlinsko"));
        citiesAndFactories.add(new Factory("Belis","lehké strojírenství-smaltované nádobí", "České Budějovice"));
        citiesAndFactories.add(new Factory("Mora Moravia","lehké strojírenství-kuchyňské spotřebiče", "Olomouc"));
        //Přesné strojírenství
        citiesAndFactories.add(new Factory("Meopta","přesné strojírenství-čočky", "Přerov"));
        citiesAndFactories.add(new Factory("Chirana","přesné strojírenství-lékařské vybavení", "Nové Město na Moravě"));
        citiesAndFactories.add(new Factory("Petrof","přesné strojírenství-klavíry", "Hradec Králové"));
        citiesAndFactories.add(new Factory("Amanti","přesné strojírenství-hudební nástroje", "Kraslice"));
        citiesAndFactories.add(new Factory("Zbrojovky","přesné strojírenství", "Uherský Brod"));
        citiesAndFactories.add(new Factory("Prim","přesné strojírenství-hodinky", "Nové Město nad Metují"));
        //investiční strojírenství
        citiesAndFactories.add(new Factory("ZVU","investiční strojírenství", "Hradec Králové"));
        //textilní průmysl
        citiesAndFactories.add(new Factory("Velveta","textilní-manchester", "Varnsdorf"));
        citiesAndFactories.add(new Factory("Jitex","textilní", "Písek"));
        citiesAndFactories.add(new Factory("Triola","textilní-plavky", ""));
        citiesAndFactories.add(new Factory("Baťa","koželužní", "Zlín"));
        citiesAndFactories.add(new Factory("Juta","textilní-agrotextilie", "Dvůr Králové"));
        citiesAndFactories.add(new Factory("Botas","koželužní", "Skuteč"));
        citiesAndFactories.add(new Factory("Pleas","textilní-spodní prádlo", "Havlíčkův Brod"));
        //spotřební průmysl
        citiesAndFactories.add(new Factory("TON","spotřební průmysl-židle", "Bystřice pod Hostýnem"));
        citiesAndFactories.add(new Factory("Solo","spotřební průmysl-sirky", "Sušice"));
        citiesAndFactories.add(new Factory("Papírny","spotřební průmysl", "Štětí u Mělníka a Větřní"));
        citiesAndFactories.add(new Factory("Koh-i-noor","spotřební průmysl", "České Budějovice"));
        //sklářský průmysl
        citiesAndFactories.add(new Factory("MOSER","sklářský průmysl", "Karlovy Vary"));
        citiesAndFactories.add(new Factory("AGC group","sklářský průmysl", "Teplice"));
        citiesAndFactories.add(new Factory("Crystalex","sklářský průmysl", "Nový Bor"));
        citiesAndFactories.add(new Factory("Preciosa","sklářský průmysl", "Kamenický Šenov"));
        citiesAndFactories.add(new Factory("THUN","sklářský průmysl-porcelán", "Stará a Nová Role"));
        //Potravinářský
        citiesAndFactories.add(new Factory("Penam, Odkolek","pekárny", "Praha"));
        citiesAndFactories.add(new Factory("Laktos","mlékarna", "Praha"));
        citiesAndFactories.add(new Factory("Danone","mlékárna", "Benešov"));
        citiesAndFactories.add(new Factory("Olma (Agrofert)","mlékárna", "Olomouc"));
        citiesAndFactories.add(new Factory("Tatra (Agrofert)","mlékárna", "Hlinsko"));
        citiesAndFactories.add(new Factory("Kunín","mlékárna", "Olomouc"));
        citiesAndFactories.add(new Factory("Seliko","konzervy", "Opava"));
        citiesAndFactories.add(new Factory("Vitana","konzervy", "Mělnicko"));
        citiesAndFactories.add(new Factory("Hamé","konzervy", "Znojmo"));
        citiesAndFactories.add(new Factory("Orion","sušenky", "Praha"));
        citiesAndFactories.add(new Factory("Deli","sušenky", "Lovosice"));
        citiesAndFactories.add(new Factory("Opavia","sušenky", "Opava"));
        citiesAndFactories.add(new Factory("Stock","alkohol", "Plzeň"));

    }
}
