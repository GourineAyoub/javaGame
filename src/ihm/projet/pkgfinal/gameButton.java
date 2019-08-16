
package ihm.projet.pkgfinal;

import com.jfoenix.controls.JFXButton;
import java.util.ArrayList;
import javafx.fxml.FXML;


public class gameButton {
 
    
    public String id;
    public int value;
    public boolean mineState = false;
    public boolean buttonState = false;
    // a list that contains all the button as elemens with all it's variabels
    public static ArrayList<gameButton> buttonsList;
    
    //arrays to store thr buttons ID in each row and each columns in the right place.
    public static ArrayList<String> row0 = new ArrayList<String>();
    public static ArrayList<String> row1 = new ArrayList<String>();
    public static ArrayList<String> row2 = new ArrayList<String>();
    public static ArrayList<String> row3 = new ArrayList<String>();
    public static ArrayList<String> row4 = new ArrayList<String>();
    public static ArrayList<String> row5 = new ArrayList<String>();
    public static ArrayList<String> row6 = new ArrayList<String>();
    public static ArrayList<String> row7 = new ArrayList<String>();
    public static ArrayList<String> row8 = new ArrayList<String>();
    public static ArrayList<String> row9 = new ArrayList<String>();
    public static ArrayList<String> row10 = new ArrayList<String>();
    public static ArrayList<String> row11 = new ArrayList<String>();
    public static ArrayList<String> row12 = new ArrayList<String>();
    public static ArrayList<String> col0 = new ArrayList<String>();
    public static ArrayList<String> col1 = new ArrayList<String>();
    public static ArrayList<String> col2 = new ArrayList<String>();
    public static ArrayList<String> col3 = new ArrayList<String>();
    public static ArrayList<String> col4 = new ArrayList<String>();
    public static ArrayList<String> col5 = new ArrayList<String>();
    public static ArrayList<String> col6 = new ArrayList<String>();
    public static ArrayList<String> col7 = new ArrayList<String>();
    public static ArrayList<String> col8 = new ArrayList<String>();
    public static ArrayList<String> col9 = new ArrayList<String>();
    public static ArrayList<String> col10 = new ArrayList<String>();
    public static ArrayList<String> col11 = new ArrayList<String>();
    public static ArrayList<String> col12 = new ArrayList<String>();
    
    

    public  gameButton(String id,int value,boolean mineState,boolean buttonState){
        
        this.id = id;
        this.value = value;
        this.mineState = mineState;
        this.buttonState = buttonState;
    }

    // a methode that adds all the buttons to the list based on the tables of values,minestate and 
    //buttonsState given as a parametres.
    public static void makeButtonsList(int values[] , boolean minesState[] , boolean buttonsState[]){
        
        buttonsList = new ArrayList<gameButton>();
        buttonsList.add(new gameButton("bt00",values[0],minesState[0],buttonsState[0]));
        buttonsList.add(new gameButton("bt01",values[1],minesState[1],buttonsState[1]));
        buttonsList.add(new gameButton("bt02",values[2],minesState[2],buttonsState[2]));
        buttonsList.add(new gameButton("bt03",values[3],minesState[3],buttonsState[3]));
        buttonsList.add(new gameButton("bt04",values[4],minesState[4],buttonsState[4]));
        buttonsList.add(new gameButton("bt05",values[5],minesState[5],buttonsState[5]));
        buttonsList.add(new gameButton("bt06",values[6],minesState[6],buttonsState[6]));
        buttonsList.add(new gameButton("bt07",values[7],minesState[7],buttonsState[7]));
        buttonsList.add(new gameButton("bt08",values[8],minesState[8],buttonsState[8]));
        buttonsList.add(new gameButton("bt09",values[9],minesState[9],buttonsState[9]));
        buttonsList.add(new gameButton("bt010",values[10],minesState[10],buttonsState[10]));
        buttonsList.add(new gameButton("bt011",values[11],minesState[11],buttonsState[11]));
        buttonsList.add(new gameButton("bt012",values[12],minesState[12],buttonsState[12]));
        buttonsList.add(new gameButton("bt10",values[13],minesState[13],buttonsState[13]));
        buttonsList.add(new gameButton("bt11",values[14],minesState[14],buttonsState[14]));
        buttonsList.add(new gameButton("bt12",values[15],minesState[15],buttonsState[15]));
        buttonsList.add(new gameButton("bt13",values[16],minesState[16],buttonsState[16]));
        buttonsList.add(new gameButton("bt14",values[17],minesState[17],buttonsState[17]));
        buttonsList.add(new gameButton("bt15",values[18],minesState[18],buttonsState[18]));
        buttonsList.add(new gameButton("bt16",values[19],minesState[19],buttonsState[19]));
        buttonsList.add(new gameButton("bt17",values[20],minesState[20],buttonsState[20]));
        buttonsList.add(new gameButton("bt18",values[21],minesState[21],buttonsState[21]));
        buttonsList.add(new gameButton("bt19",values[22],minesState[22],buttonsState[22]));
        buttonsList.add(new gameButton("bt110",values[23],minesState[23],buttonsState[23]));
        buttonsList.add(new gameButton("bt111",values[24],minesState[24],buttonsState[24]));
        buttonsList.add(new gameButton("bt112",values[25],minesState[25],buttonsState[25]));
        buttonsList.add(new gameButton("bt20",values[26],minesState[26],buttonsState[26]));
        buttonsList.add(new gameButton("bt21",values[27],minesState[27],buttonsState[27]));
        buttonsList.add(new gameButton("bt22",values[28],minesState[28],buttonsState[28]));
        buttonsList.add(new gameButton("bt23",values[29],minesState[29],buttonsState[29]));
        buttonsList.add(new gameButton("bt24",values[30],minesState[30],buttonsState[30]));
        buttonsList.add(new gameButton("bt25",values[31],minesState[31],buttonsState[31]));
        buttonsList.add(new gameButton("bt26",values[32],minesState[32],buttonsState[32]));
        buttonsList.add(new gameButton("bt27",values[33],minesState[33],buttonsState[33]));
        buttonsList.add(new gameButton("bt28",values[34],minesState[34],buttonsState[34]));
        buttonsList.add(new gameButton("bt29",values[35],minesState[35],buttonsState[35]));
        buttonsList.add(new gameButton("bt210",values[36],minesState[36],buttonsState[36]));
        buttonsList.add(new gameButton("bt211",values[37],minesState[37],buttonsState[37]));
        buttonsList.add(new gameButton("bt212",values[38],minesState[38],buttonsState[38]));
        buttonsList.add(new gameButton("bt30",values[39],minesState[39],buttonsState[39]));
        buttonsList.add(new gameButton("bt31",values[40],minesState[40],buttonsState[40]));
        buttonsList.add(new gameButton("bt32",values[41],minesState[41],buttonsState[41]));
        buttonsList.add(new gameButton("bt33",values[42],minesState[42],buttonsState[42]));
        buttonsList.add(new gameButton("bt34",values[43],minesState[43],buttonsState[43]));
        buttonsList.add(new gameButton("bt35",values[44],minesState[44],buttonsState[44]));
        buttonsList.add(new gameButton("bt36",values[45],minesState[45],buttonsState[45]));
        buttonsList.add(new gameButton("bt37",values[46],minesState[46],buttonsState[46]));
        buttonsList.add(new gameButton("bt38",values[47],minesState[47],buttonsState[47]));
        buttonsList.add(new gameButton("bt39",values[48],minesState[48],buttonsState[48]));
        buttonsList.add(new gameButton("bt310",values[49],minesState[49],buttonsState[49]));
        buttonsList.add(new gameButton("bt311",values[50],minesState[50],buttonsState[50]));
        buttonsList.add(new gameButton("bt312",values[51],minesState[51],buttonsState[51]));
        buttonsList.add(new gameButton("bt40",values[52],minesState[52],buttonsState[52]));
        buttonsList.add(new gameButton("bt41",values[53],minesState[53],buttonsState[53]));
        buttonsList.add(new gameButton("bt42",values[54],minesState[54],buttonsState[54]));
        buttonsList.add(new gameButton("bt43",values[55],minesState[55],buttonsState[55]));
        buttonsList.add(new gameButton("bt44",values[56],minesState[56],buttonsState[56]));
        buttonsList.add(new gameButton("bt45",values[57],minesState[57],buttonsState[57]));
        buttonsList.add(new gameButton("bt46",values[58],minesState[58],buttonsState[58]));
        buttonsList.add(new gameButton("bt47",values[59],minesState[59],buttonsState[59]));
        buttonsList.add(new gameButton("bt48",values[60],minesState[60],buttonsState[60]));
        buttonsList.add(new gameButton("bt49",values[61],minesState[61],buttonsState[61]));
        buttonsList.add(new gameButton("bt410",values[62],minesState[62],buttonsState[62]));
        buttonsList.add(new gameButton("bt411",values[63],minesState[63],buttonsState[63]));
        buttonsList.add(new gameButton("bt412",values[64],minesState[64],buttonsState[64]));
        buttonsList.add(new gameButton("bt50",values[65],minesState[65],buttonsState[65]));
        buttonsList.add(new gameButton("bt51",values[66],minesState[66],buttonsState[66]));
        buttonsList.add(new gameButton("bt52",values[67],minesState[67],buttonsState[67]));
        buttonsList.add(new gameButton("bt53",values[68],minesState[68],buttonsState[68]));
        buttonsList.add(new gameButton("bt54",values[69],minesState[69],buttonsState[69]));
        buttonsList.add(new gameButton("bt55",values[70],minesState[70],buttonsState[70]));
        buttonsList.add(new gameButton("bt56",values[71],minesState[71],buttonsState[71]));
        buttonsList.add(new gameButton("bt57",values[72],minesState[72],buttonsState[72]));
        buttonsList.add(new gameButton("bt58",values[73],minesState[73],buttonsState[73]));
        buttonsList.add(new gameButton("bt59",values[74],minesState[74],buttonsState[74]));
        buttonsList.add(new gameButton("bt510",values[75],minesState[75],buttonsState[75]));
        buttonsList.add(new gameButton("bt511",values[76],minesState[76],buttonsState[76]));
        buttonsList.add(new gameButton("bt512",values[77],minesState[77],buttonsState[77]));
        buttonsList.add(new gameButton("bt60",values[78],minesState[78],buttonsState[78]));
        buttonsList.add(new gameButton("bt61",values[79],minesState[79],buttonsState[79]));
        buttonsList.add(new gameButton("bt62",values[80],minesState[80],buttonsState[80]));
        buttonsList.add(new gameButton("bt63",values[81],minesState[81],buttonsState[81]));
        buttonsList.add(new gameButton("bt64",values[82],minesState[82],buttonsState[82]));
        buttonsList.add(new gameButton("bt65",values[83],minesState[83],buttonsState[83]));
        buttonsList.add(new gameButton("bt66",values[168],minesState[168],buttonsState[168]));
        buttonsList.add(new gameButton("bt67",values[84],minesState[84],buttonsState[84]));
        buttonsList.add(new gameButton("bt68",values[85],minesState[85],buttonsState[85]));
        buttonsList.add(new gameButton("bt69",values[86],minesState[86],buttonsState[86]));
        buttonsList.add(new gameButton("bt610",values[87],minesState[87],buttonsState[87]));
        buttonsList.add(new gameButton("bt611",values[88],minesState[88],buttonsState[88]));
        buttonsList.add(new gameButton("bt612",values[89],minesState[89],buttonsState[89]));
        buttonsList.add(new gameButton("bt70",values[90],minesState[90],buttonsState[90]));
        buttonsList.add(new gameButton("bt71",values[91],minesState[91],buttonsState[91]));
        buttonsList.add(new gameButton("bt72",values[92],minesState[92],buttonsState[92]));
        buttonsList.add(new gameButton("bt73",values[93],minesState[93],buttonsState[93]));
        buttonsList.add(new gameButton("bt74",values[94],minesState[94],buttonsState[94]));
        buttonsList.add(new gameButton("bt75",values[95],minesState[95],buttonsState[95]));
        buttonsList.add(new gameButton("bt76",values[96],minesState[96],buttonsState[96]));
        buttonsList.add(new gameButton("bt77",values[97],minesState[97],buttonsState[97]));
        buttonsList.add(new gameButton("bt78",values[98],minesState[98],buttonsState[98]));
        buttonsList.add(new gameButton("bt79",values[99],minesState[99],buttonsState[99]));
        buttonsList.add(new gameButton("bt710",values[100],minesState[100],buttonsState[100]));
        buttonsList.add(new gameButton("bt711",values[101],minesState[101],buttonsState[101]));
        buttonsList.add(new gameButton("bt712",values[102],minesState[102],buttonsState[102]));
        buttonsList.add(new gameButton("bt80",values[103],minesState[103],buttonsState[103]));
        buttonsList.add(new gameButton("bt81",values[104],minesState[104],buttonsState[104]));
        buttonsList.add(new gameButton("bt82",values[105],minesState[105],buttonsState[105]));
        buttonsList.add(new gameButton("bt83",values[106],minesState[106],buttonsState[106]));
        buttonsList.add(new gameButton("bt84",values[107],minesState[107],buttonsState[107]));
        buttonsList.add(new gameButton("bt85",values[108],minesState[108],buttonsState[108]));
        buttonsList.add(new gameButton("bt86",values[109],minesState[109],buttonsState[109]));
        buttonsList.add(new gameButton("bt87",values[110],minesState[110],buttonsState[110]));
        buttonsList.add(new gameButton("bt88",values[111],minesState[111],buttonsState[111]));
        buttonsList.add(new gameButton("bt89",values[112],minesState[112],buttonsState[112]));
        buttonsList.add(new gameButton("bt810",values[113],minesState[113],buttonsState[113]));
        buttonsList.add(new gameButton("bt811",values[114],minesState[114],buttonsState[114]));
        buttonsList.add(new gameButton("bt812",values[115],minesState[115],buttonsState[115]));
        buttonsList.add(new gameButton("bt90",values[116],minesState[116],buttonsState[116]));
        buttonsList.add(new gameButton("bt91",values[117],minesState[117],buttonsState[117]));
        buttonsList.add(new gameButton("bt92",values[118],minesState[118],buttonsState[118]));
        buttonsList.add(new gameButton("bt93",values[119],minesState[119],buttonsState[119]));
        buttonsList.add(new gameButton("bt94",values[120],minesState[120],buttonsState[120]));
        buttonsList.add(new gameButton("bt95",values[121],minesState[121],buttonsState[121]));
        buttonsList.add(new gameButton("bt96",values[122],minesState[122],buttonsState[122]));
        buttonsList.add(new gameButton("bt97",values[123],minesState[123],buttonsState[123]));
        buttonsList.add(new gameButton("bt98",values[124],minesState[124],buttonsState[124]));
        buttonsList.add(new gameButton("bt99",values[125],minesState[125],buttonsState[125]));
        buttonsList.add(new gameButton("bt910",values[126],minesState[126],buttonsState[126]));
        buttonsList.add(new gameButton("bt911",values[127],minesState[127],buttonsState[127]));
        buttonsList.add(new gameButton("bt912",values[128],minesState[128],buttonsState[128]));
        buttonsList.add(new gameButton("bt100",values[129],minesState[129],buttonsState[129]));
        buttonsList.add(new gameButton("bt101",values[130],minesState[130],buttonsState[130]));
        buttonsList.add(new gameButton("bt102",values[131],minesState[131],buttonsState[131]));
        buttonsList.add(new gameButton("bt103",values[132],minesState[132],buttonsState[132]));
        buttonsList.add(new gameButton("bt104",values[133],minesState[133],buttonsState[133]));
        buttonsList.add(new gameButton("bt105",values[134],minesState[134],buttonsState[134]));
        buttonsList.add(new gameButton("bt106",values[135],minesState[135],buttonsState[135]));
        buttonsList.add(new gameButton("bt107",values[136],minesState[136],buttonsState[136]));
        buttonsList.add(new gameButton("bt108",values[137],minesState[137],buttonsState[137]));
        buttonsList.add(new gameButton("bt109",values[138],minesState[138],buttonsState[138]));
        buttonsList.add(new gameButton("bt1010",values[139],minesState[139],buttonsState[139]));
        buttonsList.add(new gameButton("bt1011",values[140],minesState[140],buttonsState[140]));
        buttonsList.add(new gameButton("bt1012",values[141],minesState[141],buttonsState[141]));
        buttonsList.add(new gameButton("bt11000",values[142],minesState[142],buttonsState[142]));
        buttonsList.add(new gameButton("bt11111",values[143],minesState[143],buttonsState[143]));
        buttonsList.add(new gameButton("bt11222",values[144],minesState[144],buttonsState[144]));
        buttonsList.add(new gameButton("bt113",values[145],minesState[145],buttonsState[145]));
        buttonsList.add(new gameButton("bt114",values[146],minesState[146],buttonsState[146]));
        buttonsList.add(new gameButton("bt115",values[147],minesState[147],buttonsState[147]));
        buttonsList.add(new gameButton("bt116",values[148],minesState[148],buttonsState[148]));
        buttonsList.add(new gameButton("bt117",values[149],minesState[149],buttonsState[149]));
        buttonsList.add(new gameButton("bt118",values[150],minesState[150],buttonsState[150]));
        buttonsList.add(new gameButton("bt119",values[151],minesState[151],buttonsState[151]));
        buttonsList.add(new gameButton("bt1110",values[152],minesState[152],buttonsState[152]));
        buttonsList.add(new gameButton("bt1111",values[153],minesState[153],buttonsState[153]));
        buttonsList.add(new gameButton("bt1112",values[154],minesState[154],buttonsState[154]));
        buttonsList.add(new gameButton("bt120",values[155],minesState[155],buttonsState[155]));
        buttonsList.add(new gameButton("bt121",values[156],minesState[156],buttonsState[156]));
        buttonsList.add(new gameButton("bt122",values[157],minesState[157],buttonsState[157]));
        buttonsList.add(new gameButton("bt123",values[158],minesState[158],buttonsState[158]));
        buttonsList.add(new gameButton("bt124",values[159],minesState[159],buttonsState[159]));
        buttonsList.add(new gameButton("bt125",values[160],minesState[160],buttonsState[160]));
        buttonsList.add(new gameButton("bt126",values[161],minesState[161],buttonsState[161]));
        buttonsList.add(new gameButton("bt127",values[162],minesState[162],buttonsState[162]));
        buttonsList.add(new gameButton("bt128",values[163],minesState[163],buttonsState[163]));
        buttonsList.add(new gameButton("bt129",values[164],minesState[164],buttonsState[164]));
        buttonsList.add(new gameButton("bt1210",values[165],minesState[165],buttonsState[165]));
        buttonsList.add(new gameButton("bt1211",values[166],minesState[166],buttonsState[166]));
        buttonsList.add(new gameButton("bt1212",values[167],minesState[167],buttonsState[167]));
        
        
    }
    
    //methode to fill the rows and the columns.
    public static void makeRowsAndColumns(){
        row0.add("bt00");
        row0.add("bt01");
        row0.add("bt02");
        row0.add("bt03");
        row0.add("bt04");
        row0.add("bt05");
        row0.add("bt06");
        row0.add("bt07");
        row0.add("bt08");
        row0.add("bt09");
        row0.add("bt010");
        row0.add("bt011");
        row0.add("bt012");
        
        row1.add("bt10");
        row1.add("bt11");
        row1.add("bt12");
        row1.add("bt13");
        row1.add("bt14");
        row1.add("bt15");
        row1.add("bt16");
        row1.add("bt17");
        row1.add("bt18");
        row1.add("bt19");
        row1.add("bt110");
        row1.add("bt111");
        row1.add("bt112");
        
        row2.add("bt20");
        row2.add("bt21");
        row2.add("bt22");
        row2.add("bt23");
        row2.add("bt24");
        row2.add("bt25");
        row2.add("bt26");
        row2.add("bt27");
        row2.add("bt28");
        row2.add("bt29");
        row2.add("bt210");
        row2.add("bt211");
        row2.add("bt212");
        
        row3.add("bt30");
        row3.add("bt31");
        row3.add("bt32");
        row3.add("bt33");
        row3.add("bt34");
        row3.add("bt35");
        row3.add("bt36");
        row3.add("bt37");
        row3.add("bt38");
        row3.add("bt39");
        row3.add("bt310");
        row3.add("bt311");
        row3.add("bt312");
        
        row4.add("bt40");
        row4.add("bt41");
        row4.add("bt42");
        row4.add("bt43");
        row4.add("bt44");
        row4.add("bt45");
        row4.add("bt46");
        row4.add("bt47");
        row4.add("bt48");
        row4.add("bt49");
        row4.add("bt410");
        row4.add("bt411");
        row4.add("bt412");
        
        row5.add("bt50");
        row5.add("bt51");
        row5.add("bt52");
        row5.add("bt53");
        row5.add("bt54");
        row5.add("bt55");
        row5.add("bt56");
        row5.add("bt57");
        row5.add("bt58");
        row5.add("bt59");
        row5.add("bt510");
        row5.add("bt511");
        row5.add("bt512");
        
        row6.add("bt60");
        row6.add("bt61");
        row6.add("bt62");
        row6.add("bt63");
        row6.add("bt64");
        row6.add("bt65");
        row6.add("bt66");
        row6.add("bt67");
        row6.add("bt68");
        row6.add("bt69");
        row6.add("bt610");
        row6.add("bt611");
        row6.add("bt612");
        
        row7.add("bt70");
        row7.add("bt71");
        row7.add("bt72");
        row7.add("bt73");
        row7.add("bt74");
        row7.add("bt75");
        row7.add("bt76");
        row7.add("bt77");
        row7.add("bt78");
        row7.add("bt79");
        row7.add("bt710");
        row7.add("bt711");
        row7.add("bt712");
        
        row8.add("bt80");
        row8.add("bt81");
        row8.add("bt82");
        row8.add("bt83");
        row8.add("bt84");
        row8.add("bt85");
        row8.add("bt86");
        row8.add("bt87");
        row8.add("bt88");
        row8.add("bt89");
        row8.add("bt810");
        row8.add("bt811");
        row8.add("bt812");
        
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        row9.add("bt90");
        
        row10.add("bt100");
        row10.add("bt101");
        row10.add("bt102");
        row10.add("bt103");
        row10.add("bt104");
        row10.add("bt105");
        row10.add("bt106");
        row10.add("bt107");
        row10.add("bt108");
        row10.add("bt109");
        row10.add("bt1010");
        row10.add("bt1011");
        row10.add("bt1012");
        
        row11.add("bt11000");
        row11.add("bt11111");
        row11.add("bt11222");
        row11.add("bt113");
        row11.add("bt114");
        row11.add("bt115");
        row11.add("bt116");
        row11.add("bt117");
        row11.add("bt118");
        row11.add("bt119");
        row11.add("bt1110");
        row11.add("bt1111");
        row11.add("bt1112");
        
        row12.add("bt120");
        row12.add("bt121");
        row12.add("bt122");
        row12.add("bt123");
        row12.add("bt124");
        row12.add("bt125");
        row12.add("bt126");
        row12.add("bt127");
        row12.add("bt128");
        row12.add("bt129");
        row12.add("bt1210");
        row12.add("bt1211");
        row12.add("bt1212");
        
        col0.add("bt00");
        col0.add("bt10");
        col0.add("bt20");
        col0.add("bt30");
        col0.add("bt40");
        col0.add("bt50");
        col0.add("bt60");
        col0.add("bt70");
        col0.add("bt80");
        col0.add("bt90");
        col0.add("bt100");
        col0.add("bt11000");
        col0.add("bt120");
        
        col1.add("bt01");
        col1.add("bt11");
        col1.add("bt21");
        col1.add("bt31");
        col1.add("bt41");
        col1.add("bt51");
        col1.add("bt61");
        col1.add("bt71");
        col1.add("bt81");
        col1.add("bt91");
        col1.add("bt101");
        col1.add("bt11111");
        col1.add("bt121");
        
        col2.add("bt02");
        col2.add("bt12");
        col2.add("bt22");
        col2.add("bt32");
        col2.add("bt42");
        col2.add("bt52");
        col2.add("bt62");
        col2.add("bt72");
        col2.add("bt82");
        col2.add("bt92");
        col2.add("bt102");
        col2.add("bt11222");
        col2.add("bt122");
        
        col3.add("bt03");
        col3.add("bt13");
        col3.add("bt23");
        col3.add("bt33");
        col3.add("bt43");
        col3.add("bt53");
        col3.add("bt63");
        col3.add("bt73");
        col3.add("bt83");
        col3.add("bt93");
        col3.add("bt103");
        col3.add("bt113");
        col3.add("bt123");
        
        col4.add("bt04");
        col4.add("bt14");
        col4.add("bt24");
        col4.add("bt34");
        col4.add("bt44");
        col4.add("bt54");
        col4.add("bt64");
        col4.add("bt74");
        col4.add("bt84");
        col4.add("bt94");
        col4.add("bt104");
        col4.add("bt114");
        col4.add("bt124");
        
        col5.add("bt05");
        col5.add("bt15");
        col5.add("bt25");
        col5.add("bt35");
        col5.add("bt45");
        col5.add("bt55");
        col5.add("bt65");
        col5.add("bt75");
        col5.add("bt85");
        col5.add("bt95");
        col5.add("bt105");
        col5.add("bt115");
        col5.add("bt125");
        
        col6.add("bt06");
        col6.add("bt16");
        col6.add("bt26");
        col6.add("bt36");
        col6.add("bt46");
        col6.add("bt56");
        col6.add("bt66");
        col6.add("bt76");
        col6.add("bt86");
        col6.add("bt96");
        col6.add("bt106");
        col6.add("bt116");
        col6.add("bt126");
        
        col7.add("bt07");
        col7.add("bt17");
        col7.add("bt27");
        col7.add("bt37");
        col7.add("bt47");
        col7.add("bt57");
        col7.add("bt67");
        col7.add("bt77");
        col7.add("bt87");
        col7.add("bt97");
        col7.add("bt107");
        col7.add("bt117");
        col7.add("bt127");
        
        col8.add("bt08");
        col8.add("bt18");
        col8.add("bt28");
        col8.add("bt38");
        col8.add("bt48");
        col8.add("bt58");
        col8.add("bt68");
        col8.add("bt78");
        col8.add("bt88");
        col8.add("bt98");
        col8.add("bt108");
        col8.add("bt118");
        col8.add("bt128");
        
        col9.add("bt09");
        col9.add("bt19");
        col9.add("bt29");
        col9.add("bt39");
        col9.add("bt49");
        col9.add("bt59");
        col9.add("bt69");
        col9.add("bt79");
        col9.add("bt89");
        col9.add("bt99");
        col9.add("bt109");
        col9.add("bt119");
        col9.add("bt129");
        
        col10.add("bt010");
        col10.add("bt110");
        col10.add("bt210");
        col10.add("bt310");
        col10.add("bt410");
        col10.add("bt510");
        col10.add("bt610");
        col10.add("bt710");
        col10.add("bt810");
        col10.add("bt910");
        col10.add("bt1010");
        col10.add("bt1110");
        col10.add("bt1210");
        
        col11.add("bt011");
        col11.add("bt111");
        col11.add("bt211");
        col11.add("bt311");
        col11.add("bt411");
        col11.add("bt511");
        col11.add("bt611");
        col11.add("bt711");
        col11.add("bt811");
        col11.add("bt911");
        col11.add("bt1011");
        col11.add("bt1111");
        col11.add("bt1211");
        
        col12.add("bt012");
        col12.add("bt112");
        col12.add("bt212");
        col12.add("bt312");
        col12.add("bt412");
        col12.add("bt512");
        col12.add("bt612");
        col12.add("bt712");
        col12.add("bt812");
        col12.add("bt912");
        col12.add("bt1012");
        col12.add("bt1112");
        col12.add("bt1212");
        
        
        
        
        
    }
    
    public static ArrayList<String> getColumn(int column){
        
        switch(column){
            case 0:{
                return col0;
            }
            case 1:{
                return col1;
            }
            case 2:{
                return col2;
            }
            case 3:{
                return col3;
            }
            case 4:{
                return col4;
            }
            case 5:{
                return col5;
            }
            case 6:{
                return col6;
            }
            case 7:{
                return col7;
            }
            case 8:{
                return col8;
            }
            case 9:{
                return col9;
            }
            case 10:{
                return col10;
            }
            case 11:{
                return col11;
            }
            case 12:{
                return col12;
            }
        }
        return null;    
    }
    
    public static ArrayList<String> getRow(int row){
        
            switch(row){
            case 0:{
                return row0;
            }
            case 1:{
                return row1;
            }
            case 2:{
                return row2;
            }
            case 3:{
                return row3;
            }
            case 4:{
                return row4;
            }
            case 5:{
                return row5;
            }
            case 6:{
                return row6;
            }
            case 7:{
                return row7;
            }
            case 8:{
                return row8;
            }
            case 9:{
                return row9;
            }
            case 10:{
                return row10;
            }
            case 11:{
                return row11;
            }
            case 12:{
                return row12;
            }
        }
        return null;
    }
    
    public static gameButton getButton(String buttonID){
        
        for (int i = 0; i < buttonsList.size(); i++) {
            if (buttonsList.get(i).id.equals(buttonID)) {
                return buttonsList.get(i);
            }
        }
        return null;
    }
    
   
}
