package sr222qn_assign3.norse_God;

import javafx.application.Application;
import java.util.ArrayList;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.geometry.Insets;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;



public class NorseGods extends Application{
	

	public void start(Stage primaryStage){
		BorderPane pane1 = new BorderPane();
		pane1.setPadding(new Insets(15,15,15,15));

		ListView<String> list = new ListView<>();
		list.setPrefWidth(150);
		list.getItems().addAll("Freyja","Freyr","Geror","Jotunn","Mjolnir","Odin","Sif","Thor");
		list.setVisible(true);

		pane1.setLeft(list);

		final ArrayList<Object> gods = new ArrayList<>();

		String Name = "Freyja";
		String Race = "AESIR";
		String information = "In Norse mythology, Freyja (/'fre??/; Old Norse for \"(the) Lady\") is a goddess associated with love, sex, beauty, fertility, gold, seiðr, war, and death. Freyja is the owner of the necklace Brísingamen, rides a chariot pulled by two cats, is accompanied by the boar Hildisvíni, and possesses a cloak of falcon feathers. By her husband Óðr, she is the mother of two daughters, Hnoss and Gersemi. Along with her brother Freyr, her father Njörðr, and her mother (Njörðr's sister, unnamed in sources), she is a member of the Vanir. Stemming from Old Norse Freyja, modern forms of the name include Freya, Freyia, and Freja.\r\n" + 
				"\r\n" + 
				"Freyja rules over her heavenly field Fólkvangr and there receives half of those that die in battle, whereas the other half go to the god Odin's hall, Valhalla. Within Fólkvangr lies her hall, Sessrúmnir. Freyja assists other deities by allowing them to use her feathered cloak, is invoked in matters of fertility and love, and is frequently sought after by powerful jötnar who wish to make her their wife. Freyja's husband, the god Óðr, is frequently absent. She cries tears of red gold for him, and searches for him under assumed names. Freyja has numerous names, including Gefn, Hörn, Mardöll, Sýr, Valfreyja, and Vanadís.\r\n" + 
				"\r\n" + 
				"Freyja is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; in the Prose Edda and Heimskringla, composed by Snorri Sturluson in the 13th century; in several Sagas of Icelanders; in the short story \"Sörla þáttr\"; in the poetry of skalds; and into the modern age in Scandinavian folklore.\r\n" + 
				"\r\n" + 
				"Scholars have debated whether Freyja and the goddess Frigg ultimately stem from a single goddess common among the Germanic peoples; connected her to the valkyries, female battlefield choosers of the slain; and analyzed her relation to other goddesses and figures in Germanic mythology, including the thrice-burnt and thrice-reborn Gullveig/Heiðr, the goddesses Gefjon, Skaði, Þorgerðr Hölgabrúðr and Irpa, Menglöð, and the 1st century CE \"Isis\" of the Suebi. Freyja's name appears in numerous place names in Scandinavia, with a high concentration in southern Sweden. Various plants in Scandinavia once bore her name, but it was replaced with the name of the Virgin Mary during the process of Christianization. Rural Scandinavians continued to acknowledge Freyja as a supernatural figure into the 19th century, and Freyja has inspired various works of art.";
		Text name = new Text(Name + "\n");


		Text race = new Text(Race + "\n");
		name.setFont(Font.font("SansSerif"));
		name.setStyle("-fx-font-weight: bolder;");


		Text infor = new Text("\n" + information);

		NorseGod freyja = new NorseGod(Name,Race,information);

		TextFlow text = new TextFlow(name,race,infor);

		ScrollPane pane2 = new ScrollPane();
		pane1.setCenter(pane2);

		pane2.setContent(text);
		pane2.setFitToWidth(true);

		gods.add(freyja);

		Name = "Freyr";
		Race = "AESIR";
		information = "Freyr (Old Norse: Lord), sometimes anglicized as Frey, is a widely attested god associated with sacral kingship, virility and prosperity, with sunshine and fair weather, and pictured as a phallic fertility god in Norse mythology. Freyr is said to \"bestow peace and pleasure on mortals\". Freyr, sometimes referred to as Yngvi-Freyr, was especially associated with Sweden and seen as an ancestor of the Swedish royal house.\r\n" + 
				"\r\n" + 
				"In the Icelandic books the Poetic Edda and the Prose Edda, Freyr is presented as one of the Vanir, the son of the sea god Njörðr, as well as the twin brother of the goddess Freyja. The gods gave him Álfheimr, the realm of the Elves, as a teething present. He rides the shining dwarf-made boar Gullinbursti and possesses the ship Skíðblaðnir which always has a favorable breeze and can be folded together and carried in a pouch when it is not being used. Freyr is also known to have been associated with the horse cult. He also kept sacred horses in his sanctuary at Thrandheim in Norway.[1] He has the servants Skírnir, Byggvir and Beyla.\r\n" + 
				"\r\n" + 
				"The most extensive surviving Freyr myth relates Freyr's falling in love with the female jötunn Gerðr. Eventually, she becomes his wife but first Freyr has to give away his sword which fights on its own \"if wise be he who wields it.\" Although deprived of this weapon, Freyr defeats the jötunn Beli with an antler. However, lacking his sword, Freyr will be killed by the fire jötunn Surtr during the events of Ragnarök.\r\n" + 
				"\r\n" + 
				"Like other Germanic deities, veneration of Freyr is revived in the modern period in Heathenry movement.";
		NorseGod Freyr = new NorseGod(Name,Race,information);
		gods.add(Freyr);

		Name = "Geror";
		Race = "AESIR";
		information = "In Norse mythology, Gerðr (Old Norse \"fenced-in\"[1]) is a jötunn, goddess, and the wife of the god Freyr. Gerðr is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources; the Prose Edda and Heimskringla, written in the 13th century by Snorri Sturluson; and in the poetry of skalds. Gerðr is sometimes modernly anglicized as Gerd or Gerth.\r\n" + 
				"\r\n" + 
				"In both the Poetic Edda and the Prose Edda, Freyr sees Gerðr from a distance, becomes deeply lovesick at the sight of her shimmering beauty, and has his servant Skírnir go to Jötunheimr (where Gerðr and her father Gymir reside) to gain her love. In the Poetic Edda Gerðr initially refuses, yet after a series of threats by Skírnir she finally agrees. In the Prose Edda, no mention of threats are made. In both sources, Gerðr agrees to meet Freyr at a fixed time at the location of Barri and, after Skírnir returns with Gerðr's response, Freyr laments that the meeting could not occur sooner. In both the Poetic Edda and the Prose Edda, Gerðr is described as the daughter of Gymir and the jötunn Aurboða.\r\n" + 
				"\r\n" + 
				"In Heimskringla, Gerðr is recorded as the wife of Freyr, euhemerized as having been a beloved king of Sweden. In the same source, the couple are the founders of the Yngling dynasty and produced a son, Fjölnir, who rose to kinghood after Freyr's passing and continued their line. Gerðr is commonly theorized to be a goddess associated with the earth. Gerðr inspired works ";
		NorseGod Geror = new NorseGod(Name,Race,information);
		gods.add(Geror);

		Name = "Jotunn";
		Race = "AESIR";
		information = "In Norse mythology, a jötunn (/'j??t?n/;[1] plural jötnar) is a type of entity contrasted with gods and other figures, such as dwarfs and elves. The entities are themselves ambiguously defined, variously referred to by several other terms, including risi, thurs, and troll.\r\n" + 
				"\r\n" + 
				"Although the term giant is sometimes used to gloss the word jötunn and its apparent synonyms in some translations and academic texts, jötnar are not necessarily notably large and may be described as exceedingly beautiful or as alarmingly grotesque.[2] Some deities, such as Skaði and Gerðr, are themselves described as jötnar, and various well-attested deities, such as Odin, are descendants of the jötnar.\r\n" + 
				"\r\n" + 
				"Norse myth traces the origin of the jötnar to the proto-being Ymir, a result of growth of asexual reproduction from the entity's body. Ymir is later killed, his body dismembered to create the world, and the jötnar survive this event by way of sailing through a flood of Ymir's blood. The jötnar dwell in Jötunheimr. In later Scandinavian folklore, the ambiguity surrounding the entities gives way to negative portrayals.";
		NorseGod Jotunn = new NorseGod(Name,Race,information);
		gods.add(Jotunn);

		Name = "Mjolnir";
		Race = "AESIR";
		information = "In Norse mythology, Mjölnir (/'mj??ln??r/;[1] Old Norse: Mjollnir, IPA: ['mj?l?nir])[2] is the hammer of Thor, the Norse god associated with thunder. Mjölnir is depicted in Norse mythology as one of the most fearsome and powerful weapons in existence, capable of leveling mountains.[3][4][5] In its account of Norse mythology, the Prose Edda relates how the hammer's characteristically short handle was due to a mistake during its manufacture. Similar hammers (Ukonvasara) were a common symbol of the god of thunder in other North European mythologies.\r\n" + 
				"\r\n" + 
				"Modern depictions of Mjolnir are prevalent amongst practitioners of Heathenry (a modern Pagan religious movement) and white supremacist groups.";
		NorseGod Mjolnir = new NorseGod(Name,Race,information);
		gods.add(Mjolnir);

		Name = "Odin";
		Race = "AESIR";
		information = "In Germanic mythology, Odin (/'o?d?n/;[1] from Old Norse: Óðinn, IPA: ['o?ðin?]) is a widely revered god. In Norse mythology, from which stems most surviving information about the god, Odin is associated with wisdom, healing, death, royalty, the gallows, knowledge, battle, sorcery, poetry, frenzy, and the runic alphabet, and is the husband of the goddess Frigg. In wider Germanic mythology and paganism, Odin was known in Old English as Woden, in Old Saxon as Wodan, and in Old High German as Wuotan or Wotan, all stemming from the reconstructed Proto-Germanic theonym *wodanaz.\r\n" + 
				"\r\n" + 
				"Odin is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania through the tribal expansions of the Migration Period and the Viking Age. In the modern period, Odin continued to be acknowledged in the rural folklore of Germanic Europe. References to Odin appear in place names throughout regions historically inhabited by the ancient Germanic peoples, and the day of the week Wednesday bears his name in many Germanic languages, including English.\r\n" + 
				"\r\n" + 
				"In Old English texts, Odin holds a particular place as a euhemerized ancestral figure among royalty, and he is frequently referred to as a founding figure among various other Germanic peoples, including the Langobards. Forms of his name appear frequently throughout the Germanic record, though narratives regarding Odin are mainly found in Old Norse works recorded in Iceland, primarily around the 13th century. These texts make up the bulk of modern understanding of Norse mythology.\r\n" + 
				"\r\n" + 
				"In Old Norse texts, Odin is depicted as one-eyed and long-bearded, frequently wielding a spear named Gungnir, and wearing a cloak and a broad hat. He is often accompanied by his animal companions and familiars—the wolves Geri and Freki and the ravens Huginn and Muninn, who bring him information from all over Midgard—and rides the flying, eight-legged steed Sleipnir across the sky and into the underworld. Odin is the son of Bestla and Borr and has two brothers, Vili and Vé. Odin is attested as having many sons, most famously the gods Thor (with Jörð) and Baldr (with Frigg), and is known by hundreds of names. In these texts, he frequently seeks greater knowledge, at times in disguise (most famously by obtaining the Mead of Poetry), makes wagers with his wife Frigg over the outcome of exploits, and takes part in both the creation of the world by way of slaying the primordial being Ymir and giving the gift of life to the first two humans Ask and Embla. Odin has a particular association with Yule, and mankind's knowledge of both the runes and poetry is also attributed to him, giving Odin aspects of the culture hero.\r\n" + 
				"\r\n" + 
				"In Old Norse texts, female beings associated with the battlefield—the valkyries—are associated with the god and Odin oversees Valhalla, where he receives half of those who die in battle, the einherjar. The other half are chosen by the goddess Freyja for her afterlife location, Fólkvangr. Odin consults the disembodied, herb-embalmed head of the wise being Mímir for advice, and during the foretold events of Ragnarök, Odin is told to lead the einherjar into battle before being consumed by the monstrous wolf Fenrir. In later folklore, Odin appears as a leader of the Wild Hunt, a ghostly procession of the dead through the winter sky. He is associated with charms and other forms of magic, particularly in Old English and Old Norse texts.\r\n" + 
				"\r\n" + 
				"Odin is a frequent subject of study in Germanic studies, and numerous theories have been put forward regarding his development. Some of these focus on Odin's particular relation to other figures; for example, the fact that Freyja's husband Óðr appears to be something of an etymological doublet of the god, whereas Odin's wife Frigg is in many ways similar to Freyja, and that Odin has a particular relation to the figure of Loki. Other approaches focus on Odin's place in the historical record, a frequent question being whether the figure of Odin derives from Proto-Indo-European religion, or whether he developed later in Germanic society. In the modern period, Odin has inspired numerous works of poetry, music, and other forms of media. He is venerated in most forms of the new religious movement Heathenry, together with other gods venerated by the ancient Germanic peoples; some branches focus particularly on him";
		NorseGod Odin = new NorseGod(Name,Race,information);
		gods.add(Odin);

		Name = "Sif";
		Race = "AESIR";
		information = "In Norse mythology, Sif (/si?f/)[1] is a goddess associated with earth. Sif is attested in the Poetic Edda, compiled in the 13th century from earlier traditional sources, and the Prose Edda, written in the 13th century by Snorri Sturluson, and in the poetry of skalds. In both the Poetic Edda and the Prose Edda, Sif is the wife of the thunder god Thor and is known for her golden hair.\r\n" + 
				"\r\n" + 
				"In the Prose Edda, Sif is named as the mother of the goddess Þrúðr by Thor and of Ullr with a father whose name is not recorded. The Prose Edda also recounts that Sif once had her hair shorn by Loki, and that Thor forced Loki to have a golden headpiece made for Sif, resulting in not only Sif's golden tresses but also five other objects for other gods.\r\n" + 
				"\r\n" + 
				"Scholars have proposed that Sif's hair may represent fields of golden wheat, that she may be associated with fertility, family, wedlock and/or that she is connected to rowan, and that there may be an allusion to her role or possibly her name in the Old English poem Beowulf.";
		NorseGod Sif = new NorseGod(Name,Race,information);
		gods.add(Sif);

		Name = "Thor";
		Race = "AESIR";
		information = "In Germanic mythology, Thor (/???r/; from Old Norse: Þórr) is a hammer-wielding god associated with thunder, lightning, storms, oak trees, strength, the protection of mankind, and also hallowing and fertility. Besides Old Norse Þórr, extensions of the god occur in Old English as Þunor, and in Old High German as Donar (runic þonar ?????). All forms of the deity stem from a Common Germanic *Þunraz (meaning 'thunder').\r\n" + 
				"\r\n" + 
				"Thor is a prominently mentioned god throughout the recorded history of the Germanic peoples, from the Roman occupation of regions of Germania, to the tribal expansions of the Migration Period, to his high popularity during the Viking Age, when, in the face of the process of the Christianization of Scandinavia, emblems of his hammer, Mjölnir, were worn and Norse pagan personal names containing the name of the god bear witness to his popularity.\r\n" + 
				"\r\n" + 
				"Due to the nature of the Germanic corpus, narratives featuring Thor are only attested in Old Norse, where Thor appears throughout Norse mythology. Norse mythology, largely recorded in Iceland from traditional material stemming from Scandinavia, provides numerous tales featuring the god. In these sources, Thor bears at least fifteen names, is the husband of the golden-haired goddess Sif, is the lover of the jötunn Járnsaxa, and is generally described as fierce eyed, red haired and red bearded.[1] With Sif, Thor fathered the goddess (and possible valkyrie) Þrúðr; with Járnsaxa, he fathered Magni; with a mother whose name is not recorded, he fathered Móði, and he is the stepfather of the god Ullr. By way of Odin, Thor has numerous brothers, including Baldr. Thor has two servants, Þjálfi and Röskva, rides in a cart or chariot pulled by two goats, Tanngrisnir and Tanngnjóstr (that he eats and resurrects), and is ascribed three dwellings (Bilskirnir, Þrúðheimr, and Þrúðvangr). Thor wields the mountain-crushing hammer, Mjölnir, wears the belt Megingjörð and the iron gloves Járngreipr, and owns the staff Gríðarvölr. Thor's exploits, including his relentless slaughter of his foes and fierce battles with the monstrous serpent Jörmungandr—and their foretold mutual deaths during the events of Ragnarök—are recorded throughout sources for Norse mythology.\r\n" + 
				"\r\n" + 
				"Into the modern period, Thor continued to be acknowledged in rural folklore throughout Germanic-speaking Europe. Thor is frequently referred to in place names, the day of the week Thursday bears his name (modern English Thursday derives from Old English Þunresdæg, 'Þunor's day'), and names stemming from the pagan period containing his own continue to be used today, particularly in Scandinavia. Thor has inspired numerous works of art and references to Thor appear in modern popular culture. Like other Germanic deities, veneration of Thor is revived in the modern period in Heathenry.";
		NorseGod Thor = new NorseGod(Name,Race,information);
		gods.add(Thor);


		pane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
		pane2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

		pane2.setPadding(new Insets(5, 5, 5, 5));
		list.setPadding(new Insets(5, 5, 5, 5));
		pane1.setCenter(pane2);

		BorderPane.setMargin(pane2, new Insets(15, 15, 10, 10));
		BorderPane.setMargin(list, new Insets(15, 15, 10, 15));

		Text l = new Text("Norse Gods And Other Beings");
		l.setFont(Font.font("SansSerif", 25));
		l.setStyle("-fx-font-weight: bolder; -fx-font-size: 20pt;");

		BorderPane.setMargin(l, new Insets(0, 15, 0, 15));
		pane1.setTop(l);

		list.getSelectionModel().selectedIndexProperty().addListener(ov -> {
			NorseGod c = (NorseGod) gods.get(list.getSelectionModel().getSelectedIndex());
			name.setText(c.getName());
			race.setText("\n"+ c.getRace() + "\n");
			infor.setText("\n" + (c.getDesc()));
		});
		Scene sc = new Scene(pane1, 700, 500);
		primaryStage.setTitle("Norse Gods");
		primaryStage.setScene(sc);
		primaryStage.show();
	}
	public static void main(String []args){
		launch(args);
	}
}
