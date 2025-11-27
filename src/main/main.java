
package main;

import com.prestige.accueil.section.section;
import com.prestige.album.tableau.tableRow;
import com.prestige.album.tableau.tableauAlbum;
import com.prestige.lecteur.AudioPlayer;
import com.prestige.swing.CustomScrollBarUI;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import static javax.swing.text.StyleConstants.Size;


public class main extends javax.swing.JFrame {

    private static final Point point = new Point();
    private int isSideSelected = 1;
    private final boolean suite = true;
    private final boolean no_suite = false;
    
    private final boolean explicit = true;
    private final boolean nonexplicit = false;
    
    public static String playinSection;
    public static String playinSubSection;
    
    public static String prevSection="";
    public static String prevSubSection="";
    
    private Thread audioPlayerThread;
    private AudioPlayer player = new AudioPlayer();
    private File audioFile = new File("src/com/prestige/songs/brysonTiller.wav");
    
    

    public void refreshSide(int n){
        switch (n) {
            case 1 -> {
                labAccueil.setForeground(new Color(179, 179, 179));
                icoAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-home-27(1).png")));
            }
            case 2 -> {
                labRechercher.setForeground(new Color(179, 179, 179));
                icoRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-search-27(1).png")));
            }
            case 3 -> {
                labBiblio.setForeground(new Color(179, 179, 179));
                icoBiblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-music-library-27(1).png")));
            }
            case 4 -> {
                labPlaylist.setForeground(new Color(179, 179, 179));
                icoPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-new-27(1).png")));
            }
            case 5 -> {
                labTitreslikés.setForeground(new Color(179, 179, 179));
                icoTitreslikés.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-27(1).png")));
            }
            default -> {
            }
        }
    }
    public main() {
        initComponents();
        
      
        albumPanel.setVisible(false);
        albumPanel.setEnabled(false);
        
        
        //Rendre la fenêtre déplaçable
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                point.x = e.getX();
                point.y = e.getY();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point p = getLocation();
                setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
            }
        });

        //Aligner la fenetre au centre
        setLocationRelativeTo(null);
       
        
        //////////////////////////////////////////////////////
        //  Ecoutés récemment
        /////////////////////////////////////////////////////
        section ecouteRec = new section("ecouteRec","Écoutés récemment",suite);
        
        ecouteRec.subSection1.setDesc("T R A P S O U L", "Bryson Tiller", " ", nonexplicit);
        ecouteRec.subSection1.setImage("src/com/prestige/images/trapsoul.png");
        
        ecouteRec.subSection2.setDesc("Don't", "Bryson Tiller", " ", explicit);
        ecouteRec.subSection2.setImage("src/com/prestige/images/trapsoul.png");
        
        ecouteRec.subSection3.setDesc("Go Crazy", "Chris Brown, Young", "Thug", explicit);
        ecouteRec.subSection3.setImage("src/com/prestige/images/slime.png");
        
        ecouteRec.subSection4.setDesc("P.A.I.N", "Tory Lanez", " ", explicit);
        ecouteRec.subSection4.setImage("src/com/prestige/images/theNewToronto.png");
        
        ecouteRec.subSection5.setDesc("Slime & B", "Chris Brown, Young", "Thug", nonexplicit);
        ecouteRec.subSection5.setImage("src/com/prestige/images/slime.png");
        
        panelItem.add(ecouteRec);
        
        ////////////////////////////////////////////////////
        //  Pour commencer
        ////////////////////////////////////////////////////
        section pourCom = new section ("pourCom","Pour commencer",no_suite);
        
        pourCom.subSection1.setDesc("Mix Chris Brown", "Tory Lanez, Bryson", "Tiller, Tems et bien plus", nonexplicit);
        pourCom.subSection1.setImage("src/com/prestige/images/mixChrisB.png");
        
        pourCom.subSection2.setDesc("Mix Future", "Tory Lanez, Young Thug,", "Bryson Tiller et bien...", nonexplicit);
        pourCom.subSection2.setImage("src/com/prestige/images/mixFuture.png");
        
        pourCom.subSection3.setDesc("Mix Jack Harlow", "Young Thug, Tory Lanez,", "Bryson Tiller et bien...", nonexplicit);
        pourCom.subSection3.setImage("src/com/prestige/images/mixJackH.png");
        
        pourCom.subSection4.setDesc("Mix Tory Lanez", "Bryson Tiller, Young", "Thug, Tems et bien plus", nonexplicit);
        pourCom.subSection4.setImage("src/com/prestige/images/mixToryL.png");
        
        pourCom.subSection5.setDesc("Mix Bryson Tiller", "Tory Lanez, Young Thug,", "Tems et bien plus", nonexplicit);
        pourCom.subSection5.setImage("src/com/prestige/images/mixBrysonT.png");
        
        panelItem.add(pourCom);
        
        
        ////////////////////////////////////////////////////
        //  Recommandations du jour
        ////////////////////////////////////////////////////
        section recomDuj = new section ("recomDuj","Recommandations du jour",suite);
        
        recomDuj.subSection1.setDesc("Slime & B", "Chris Brown, Young", "Thug", nonexplicit);
        recomDuj.subSection1.setImage("src/com/prestige/images/slime.png");
        
        recomDuj.subSection2.setDesc("T R A P S O U L", "Bryson Tiller", " ", nonexplicit);
        recomDuj.subSection2.setImage("src/com/prestige/images/trapsoul.png");
        
        recomDuj.subSection3.setDesc("Late Nights: The A...", "Jeremih", " ", nonexplicit);
        recomDuj.subSection3.setImage("src/com/prestige/images/LateNights.png");
        
        recomDuj.subSection4.setDesc("Chixtape 5", "Tory Lanez", " ", nonexplicit);
        recomDuj.subSection4.setImage("src/com/prestige/images/Chixtape5.png");
        
        recomDuj.subSection5.setDesc("Slide(Remix)(feat...", "H.E.R., A Boogie Wit da", "Hoodie, Chris Brown", nonexplicit);
        recomDuj.subSection5.setImage("src/com/prestige/images/slide.png");
        
        
        panelItem.add(recomDuj);
        
        ////////////////////////////////////////////////////
        //  Plus du genre de Tory Lanez
        ////////////////////////////////////////////////////
        section plusTl = new section ("plusTl","Plus du genre de Tory Lanez",suite);
        
        plusTl.subSection1.setDesc("Jeremih", "Artiste", " ", nonexplicit);
        plusTl.subSection1.setRoundImage("/com/prestige/images/jeremih.jpeg");
        
        plusTl.subSection2.setDesc("G-Eazy", "Artiste", " ", nonexplicit);
        plusTl.subSection2.setRoundImage("/com/prestige/images/g-eazy.jpeg");
        
        plusTl.subSection3.setDesc("These Things Hap...", "G-Eazy", " ", nonexplicit);
        plusTl.subSection3.setImage("src/com/prestige/images/thethingsHappen.png");
        
        
        plusTl.subSection4.setDesc("True to Self", "Bryson Tiller", " ", nonexplicit);
        plusTl.subSection4.setImage("src/com/prestige/images/trueToSelf.png");
        
        
        plusTl.subSection5.setDesc("Wait", "August Alsina", " ", nonexplicit);
        plusTl.subSection5.setImage("src/com/prestige/images/wait.png");
        
        
        panelItem.add(plusTl);
        
        ////////////////////////////////////////////////////
        //  Plus du genre de Bryson Tiller
        ////////////////////////////////////////////////////
        section plusBt = new section ("plusBt","Plus du genre de Bryson Tiller",suite);
        
        plusBt.subSection1.setDesc("TYus", "Artiste", " ", nonexplicit);
        plusBt.subSection1.setRoundImage("/com/prestige/images/TYuS.jpeg");
        
        plusBt.subSection2.setDesc("Sy Ari Da Kid", "Artiste", " ", nonexplicit);
        plusBt.subSection2.setRoundImage("/com/prestige/images/syAriDaKid.jpeg");
        
        plusBt.subSection3.setDesc("SAFE", "Artiste", " ", nonexplicit);
        plusBt.subSection3.setRoundImage("/com/prestige/images/safe.jpeg");
        
        plusBt.subSection4.setDesc("I Love My'10s R&B", "The most essential R&B", "songs from the 2010's...", nonexplicit);
        plusBt.subSection4.setImage("src/com/prestige/images/10s.png");
        
        plusBt.subSection5.setDesc("HNDRXX", "Future", " ", nonexplicit);
        plusBt.subSection5.setImage("src/com/prestige/images/HNDRXX.png");
        
        
        panelItem.add(plusBt);
                
        ////////////////////////////////////////////////////
        //  Plus du genre de Chris Brown
        ////////////////////////////////////////////////////
         section plusCb = new section ("plusCb","Plus du genre de Chris Brown",suite);
        
        plusCb.subSection1.setDesc("Baby Bash", "Artiste", " ", nonexplicit);
        plusCb.subSection1.setRoundImage("/com/prestige/images/babyBash.jpeg");
        
        plusCb.subSection2.setDesc("Ciara", "Artiste", " ", nonexplicit);
        plusCb.subSection2.setRoundImage("/com/prestige/images/ciara.jpeg");
        
        plusCb.subSection3.setDesc("Plies", "Artiste", " ", nonexplicit);
        plusCb.subSection3.setRoundImage("/com/prestige/images/plies.jpeg");
        
        plusCb.subSection4.setDesc("August Alsina", "Artiste", " ", nonexplicit);
        plusCb.subSection4.setRoundImage("/com/prestige/images/august.jpeg");
        
        plusCb.subSection5.setDesc("I Love My'00s R&B", "Check out these", "throwback R&B jams...", nonexplicit);
        plusCb.subSection5.setImage("src/com/prestige/images/00s.png");
        
        
        panelItem.add(plusCb);
        
        ////////////////////////////////////////////////////
        //  Artistes recommandés
        ////////////////////////////////////////////////////
        section artisteR = new section ("artisteR","Artistes recommandés",suite);
        
        artisteR.subSection1.setDesc("Tory Lanez", "Artiste", " ", nonexplicit);
        artisteR.subSection1.setRoundImage("/com/prestige/images/tory.jpeg");
        
        artisteR.subSection2.setDesc("Bryson Tiller", "Artiste", " ", nonexplicit);
        artisteR.subSection2.setRoundImage("/com/prestige/images/bryson.jpeg");
        
        artisteR.subSection3.setDesc("Eric Bellinger", "Artiste", " ", nonexplicit);
        artisteR.subSection3.setRoundImage("/com/prestige/images/ericBelliger.jpeg");
        
        artisteR.subSection4.setDesc("PARTYNEXTDOOR", "Artiste", " ", nonexplicit);
        artisteR.subSection4.setRoundImage("/com/prestige/images/party.jpeg");
        
        artisteR.subSection5.setDesc("Vedo", "Artiste", " ", nonexplicit);
        artisteR.subSection5.setRoundImage("/com/prestige/images/vedo.jpeg");
        
        
        panelItem.add(artisteR);
        

        
            
        ////////////////////////////////////////////////////
        //  Remplir Tableau Album
        ////////////////////////////////////////////////////
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(1,"Intro (Difference)","Bryson Tiller",true,"33956607","1:31")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(2,"Let Em' Know","Bryson Tiller",true,"113068998","4:21")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(3,"Exchange","Bryson Tiller",true,"752048448","3:14")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(4,"For However Long","Bryson Tiller",true,"58519626","2:04")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(5,"Don't","Bryson Tiller",true,"891178221","3:18")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(6,"Open Interlude","Bryson Tiller",true,"49335832","2:41")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(7,"Ten Nine Fourteen","Bryson Tiller",true,"35524632","3:10")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(8,"The Sequence","Bryson Tiller",true,"43746265","3:14")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(9,"Rambo","Bryson Tiller",true,"90205955","3:43")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(10,"502 Come Up","Bryson Tiller",true,"57050014","3:16")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(11,"Sorry Not Sorry","Bryson Tiller",true,"206493435","3:20")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(12,"Been That Way","Bryson Tiller",true,"121547075","3:19")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(13,"Overtime","Bryson Tiller",true,"87615689","3:38")});
        sectionTableau1.tableauAlbum1.addRow(new Object[]{new tableRow(14,"Right My Wrongs","Bryson Tiller",false,"309508503","4:09")});
        sectionTableau1.tableauAlbum1.revalidate();
        
           
        ////////////////////////////////////////////////////
        // Plus de contenus de Bryson Tiller VOIR LA DISCOGRAPHIE 
        ////////////////////////////////////////////////////
        section pdcBT = new section("pdcBT","Plus de contenus de Bryson Tiller",suite,"VOIR LA DISCOGRAPHIE");
        
        pdcBT.subSection1.setDesc("T R A P S O U L", "2015", " ", nonexplicit);
        pdcBT.subSection1.setImage("src/com/prestige/images/trapsoul.png");
        
        pdcBT.subSection2.setDesc("A N N I V E R S A R Y", "2020", " ", nonexplicit);
        pdcBT.subSection2.setImage("src/com/prestige/images/anniversary.png");
        
        pdcBT.subSection3.setDesc("What Would You ...", "2022", " ", nonexplicit);
        pdcBT.subSection3.setImage("src/com/prestige/images/wwyd.png");
        
        pdcBT.subSection4.setDesc("Outside", "2022", " ", nonexplicit);
        pdcBT.subSection4.setImage("src/com/prestige/images/outside.png");
        
        pdcBT.subSection5.setDesc("T R A P S O U L (D...", "2020", " ", nonexplicit);
        pdcBT.subSection5.setImage("src/com/prestige/images/deluxe.png");
        
        
        panelItem1.add(pdcBT);
        
        try {
            ////////////////////////////////////////////////////
            //  PanelImage1
            ////////////////////////////////////////////////////
            panelImage1.setImage("src/com/prestige/images/trapsoulmini.png");
            ////////////////////////////////////////////////////
            //
            ////////////////////////////////////////////////////
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        reculer = new com.prestige.swing.circleButtonLike("/com/prestige/icons/icons8-back-20(1).png");
        avancer = new com.prestige.swing.circleButtonLike("/com/prestige/icons/icons8-forward-20.png");
        accountPanel1 = new com.prestige.swing.accountPanel();
        outterPanel1 = new com.prestige.subButton.outterPanel();
        jPanel5 = new javax.swing.JPanel();
        accueilPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem = new com.prestige.accueil.Container.PanelItem();
        albumPanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        roundRectangle2 = new com.prestige.swing.RoundRectangle();
        jScrollPane3 = new javax.swing.JScrollPane();
        panelItem1 = new com.prestige.album.container.PanelItem();
        heroPanel1 = new com.prestige.album.hero.heroPanel();
        downHero2 = new com.prestige.album.downhero.downHero();
        sectionTableau1 = new com.prestige.album.tableau.sectionTableau();
        downtable1 = new com.prestige.album.downtable.downtable();
        jPanel2 = new javax.swing.JPanel();
        icoAccueil = new javax.swing.JLabel();
        labAccueil = new com.prestige.fonts.GothamLabel();
        icoRechercher = new javax.swing.JLabel();
        icoBiblio = new javax.swing.JLabel();
        icoPlaylist = new javax.swing.JLabel();
        icoTitreslikés = new javax.swing.JLabel();
        labRechercher = new com.prestige.fonts.GothamLabel();
        labBiblio = new com.prestige.fonts.GothamLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labPlaylist = new com.prestige.fonts.GothamLabel();
        labTitreslikés = new com.prestige.fonts.GothamLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        gothamLabel2 = new com.prestige.fonts.GothamLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gothamLabel1 = new com.prestige.fonts.GothamLabel();
        gothamLabel3 = new com.prestige.fonts.GothamLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rondPanel2 = new com.prestige.swing.RondPanel();
        rondPanel3 = new com.prestige.swing.RondPanel();
        rondPanel4 = new com.prestige.swing.RondPanel();
        rondPanel13 = new com.prestige.swing.RondPanel();
        rondPanel14 = new com.prestige.swing.RondPanel();
        rondPanel15 = new com.prestige.swing.RondPanel();
        rondPanel18 = new com.prestige.swing.RondPanel();
        rondPanel17 = new com.prestige.swing.RondPanel();
        rondPanel16 = new com.prestige.swing.RondPanel();
        gothamLabel4 = new com.prestige.fonts.GothamLabel();
        gothamLabel5 = new com.prestige.fonts.GothamLabel();
        gothamLabel6 = new com.prestige.fonts.GothamLabel();
        gothamLabel7 = new com.prestige.fonts.GothamLabel();
        buttonLike1 = new com.prestige.swing.ButtonLike();
        gothamLabel8 = new com.prestige.fonts.GothamLabel();
        winButtons2 = new com.prestige.winButtons.winButtons();
        downPanel1 = new downPanel.DownPanel();
        panelImage1 = new com.prestige.accueil.subSection.panelImage();
        gothamLabel9 = new com.prestige.fonts.GothamLabel();
        gothamLabel10 = new com.prestige.fonts.GothamLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Principal.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));
        jPanel1.setMaximumSize(new java.awt.Dimension(1085, 801));
        jPanel1.setMinimumSize(new java.awt.Dimension(1085, 801));

        headerPanel.setBackground(new java.awt.Color(30, 30, 30));

        reculer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reculerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(reculer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(avancer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(outterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(accountPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(outterPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reculer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(avancer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accountPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setLayout(new javax.swing.OverlayLayout(jPanel5));

        accueilPanel.setBackground(new java.awt.Color(30, 30, 30));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
        jScrollPane1.setViewportView(panelItem);

        javax.swing.GroupLayout accueilPanelLayout = new javax.swing.GroupLayout(accueilPanel);
        accueilPanel.setLayout(accueilPanelLayout);
        accueilPanelLayout.setHorizontalGroup(
            accueilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        accueilPanelLayout.setVerticalGroup(
            accueilPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );

        jPanel5.add(accueilPanel);

        albumPanel.setBackground(new java.awt.Color(30, 30, 30));
        albumPanel.setMaximumSize(new java.awt.Dimension(1085, 738));
        albumPanel.setMinimumSize(new java.awt.Dimension(1085, 738));

        jPanel6.setBackground(new java.awt.Color(24, 24, 24));

        roundRectangle2.setBackground(new java.awt.Color(19, 19, 19));

        javax.swing.GroupLayout roundRectangle2Layout = new javax.swing.GroupLayout(roundRectangle2);
        roundRectangle2.setLayout(roundRectangle2Layout);
        roundRectangle2Layout.setHorizontalGroup(
            roundRectangle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 859, Short.MAX_VALUE)
        );
        roundRectangle2Layout.setVerticalGroup(
            roundRectangle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(roundRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(roundRectangle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        jScrollPane3.getVerticalScrollBar().setUnitIncrement(20);

        panelItem1.add(heroPanel1);
        panelItem1.add(downHero2);
        panelItem1.add(sectionTableau1);
        panelItem1.add(downtable1);

        jScrollPane3.setViewportView(panelItem1);

        javax.swing.GroupLayout albumPanelLayout = new javax.swing.GroupLayout(albumPanel);
        albumPanel.setLayout(albumPanelLayout);
        albumPanelLayout.setHorizontalGroup(
            albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE)
        );
        albumPanelLayout.setVerticalGroup(
            albumPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albumPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(albumPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setMaximumSize(new java.awt.Dimension(240, 72));
        jPanel2.setMinimumSize(new java.awt.Dimension(240, 72));

        icoAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-home-27.png"))); // NOI18N

        labAccueil.setForeground(new java.awt.Color(255, 255, 255));
        labAccueil.setText("Accueil");
        labAccueil.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        labAccueil.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labAccueil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labAccueilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labAccueilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labAccueilMouseExited(evt);
            }
        });

        icoRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-search-27(1).png"))); // NOI18N

        icoBiblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-music-library-27(1).png"))); // NOI18N

        icoPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-new-27(1).png"))); // NOI18N

        icoTitreslikés.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-27(1).png"))); // NOI18N

        labRechercher.setForeground(new java.awt.Color(179, 179, 179));
        labRechercher.setText("Rechercher");
        labRechercher.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        labRechercher.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labRechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labRechercherMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labRechercherMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labRechercherMouseExited(evt);
            }
        });

        labBiblio.setForeground(new java.awt.Color(179, 179, 179));
        labBiblio.setText("Bibliothèque");
        labBiblio.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        labBiblio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labBiblio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labBiblioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labBiblioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labBiblioMouseExited(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        labPlaylist.setForeground(new java.awt.Color(179, 179, 179));
        labPlaylist.setText("Créer une playlist");
        labPlaylist.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        labPlaylist.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labPlaylistMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labPlaylistMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labPlaylistMouseExited(evt);
            }
        });

        labTitreslikés.setForeground(new java.awt.Color(179, 179, 179));
        labTitreslikés.setText("Titres Likés");
        labTitreslikés.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N
        labTitreslikés.setCursor(new Cursor(Cursor.HAND_CURSOR));
        labTitreslikés.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labTitreslikésMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labTitreslikésMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labTitreslikésMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-more-27.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(icoTitreslikés)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labTitreslikés, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(icoBiblio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(icoRechercher)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labRechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(icoAccueil)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(icoPlaylist)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labPlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(icoAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labAccueil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labRechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icoRechercher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icoBiblio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icoPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icoTitreslikés, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labTitreslikés, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(508, 508, 508))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(265, 760));

        gothamLabel2.setForeground(new java.awt.Color(255, 255, 255));
        gothamLabel2.setText("Activité de vos amis");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-user-male-28.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-fermer-24.png"))); // NOI18N

        gothamLabel1.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel1.setText("Autorisez vos amis et abonnés sur");
        gothamLabel1.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        gothamLabel3.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel3.setText("Spotify à voir ce que vous écoutez.");
        gothamLabel3.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-user-50.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-user-50.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-user-50.png"))); // NOI18N

        javax.swing.GroupLayout rondPanel2Layout = new javax.swing.GroupLayout(rondPanel2);
        rondPanel2.setLayout(rondPanel2Layout);
        rondPanel2Layout.setHorizontalGroup(
            rondPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        rondPanel2Layout.setVerticalGroup(
            rondPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel3Layout = new javax.swing.GroupLayout(rondPanel3);
        rondPanel3.setLayout(rondPanel3Layout);
        rondPanel3Layout.setHorizontalGroup(
            rondPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel3Layout.setVerticalGroup(
            rondPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel4Layout = new javax.swing.GroupLayout(rondPanel4);
        rondPanel4.setLayout(rondPanel4Layout);
        rondPanel4Layout.setHorizontalGroup(
            rondPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel4Layout.setVerticalGroup(
            rondPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel13Layout = new javax.swing.GroupLayout(rondPanel13);
        rondPanel13.setLayout(rondPanel13Layout);
        rondPanel13Layout.setHorizontalGroup(
            rondPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        rondPanel13Layout.setVerticalGroup(
            rondPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel14Layout = new javax.swing.GroupLayout(rondPanel14);
        rondPanel14.setLayout(rondPanel14Layout);
        rondPanel14Layout.setHorizontalGroup(
            rondPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel14Layout.setVerticalGroup(
            rondPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel15Layout = new javax.swing.GroupLayout(rondPanel15);
        rondPanel15.setLayout(rondPanel15Layout);
        rondPanel15Layout.setHorizontalGroup(
            rondPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel15Layout.setVerticalGroup(
            rondPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel18Layout = new javax.swing.GroupLayout(rondPanel18);
        rondPanel18.setLayout(rondPanel18Layout);
        rondPanel18Layout.setHorizontalGroup(
            rondPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        rondPanel18Layout.setVerticalGroup(
            rondPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel17Layout = new javax.swing.GroupLayout(rondPanel17);
        rondPanel17.setLayout(rondPanel17Layout);
        rondPanel17Layout.setHorizontalGroup(
            rondPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel17Layout.setVerticalGroup(
            rondPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout rondPanel16Layout = new javax.swing.GroupLayout(rondPanel16);
        rondPanel16.setLayout(rondPanel16Layout);
        rondPanel16Layout.setHorizontalGroup(
            rondPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        rondPanel16Layout.setVerticalGroup(
            rondPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        gothamLabel4.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel4.setText("Accédez à Préférences > Partage et");
        gothamLabel4.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        gothamLabel5.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel5.setText("activez « Partager mon activité");
        gothamLabel5.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        gothamLabel6.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel6.setText("d'écoute sur Spotify ». Vous pouvez");
        gothamLabel6.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        gothamLabel7.setForeground(new java.awt.Color(179, 179, 179));
        gothamLabel7.setText("désactiver ce réglage à tout moment.");
        gothamLabel7.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gothamLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addComponent(gothamLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rondPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rondPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rondPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rondPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(gothamLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gothamLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(gothamLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rondPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rondPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(rondPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(rondPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(gothamLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gothamLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonLike1.setBackground(new java.awt.Color(255, 255, 255));
        buttonLike1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonLike1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonLike1MouseExited(evt);
            }
        });

        gothamLabel8.setText("Préférences");

        javax.swing.GroupLayout buttonLike1Layout = new javax.swing.GroupLayout(buttonLike1);
        buttonLike1.setLayout(buttonLike1Layout);
        buttonLike1Layout.setHorizontalGroup(
            buttonLike1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonLike1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(gothamLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        buttonLike1Layout.setVerticalGroup(
            buttonLike1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLike1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(gothamLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(buttonLike1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(winButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addComponent(winButtons2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(buttonLike1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );

        downPanel1.setBackground(new java.awt.Color(24, 24, 24));
        downPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        gothamLabel9.setForeground(new java.awt.Color(255, 255, 255));
        gothamLabel9.setText("Don't");
        gothamLabel9.setFont(new java.awt.Font("Gotham-Bold", 1, 14)); // NOI18N

        gothamLabel10.setForeground(new java.awt.Color(255, 255, 255));
        gothamLabel10.setText("Bryson Tiller");
        gothamLabel10.setEnabled(false);
        gothamLabel10.setFont(new java.awt.Font("Gotham-Bold", 0, 14)); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-20.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-35.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-end-30.png"))); // NOI18N
        jLabel9.setText(" ");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-skip-to-start-30.png"))); // NOI18N
        jLabel10.setText(" ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-shuffle-25.png"))); // NOI18N
        jLabel11.setText(" ");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-repeat-30 (1).png"))); // NOI18N
        jLabel12.setText(" ");

        javax.swing.GroupLayout downPanel1Layout = new javax.swing.GroupLayout(downPanel1);
        downPanel1.setLayout(downPanel1Layout);
        downPanel1Layout.setHorizontalGroup(
            downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gothamLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gothamLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(498, 498, 498)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        downPanel1Layout.setVerticalGroup(
            downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(downPanel1Layout.createSequentialGroup()
                .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(downPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(gothamLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(gothamLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(downPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addComponent(jLabel8)
                                .addGroup(downPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)))))
                    .addGroup(downPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(downPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(downPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labRechercherMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRechercherMouseEntered
        if(isSideSelected != 2)
            labRechercher.setForeground(Color.WHITE);
    }//GEN-LAST:event_labRechercherMouseEntered

    private void labAccueilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAccueilMouseEntered
        if(isSideSelected != 1)
        {
           labAccueil.setForeground(Color.WHITE);
        }
        
    }//GEN-LAST:event_labAccueilMouseEntered

    private void labBiblioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBiblioMouseEntered
        if(isSideSelected != 3)
            labBiblio.setForeground(Color.WHITE);
    }//GEN-LAST:event_labBiblioMouseEntered

    private void labPlaylistMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labPlaylistMouseEntered
        if(isSideSelected != 4){
          labPlaylist.setForeground(Color.white);
          icoPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-new-27.png")));
        }
            
    }//GEN-LAST:event_labPlaylistMouseEntered

    private void labTitreslikésMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTitreslikésMouseEntered
        if(isSideSelected != 5){
            labTitreslikés.setForeground(Color.WHITE);
            icoTitreslikés.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-27.png")));
        }
            
    }//GEN-LAST:event_labTitreslikésMouseEntered

    private void labAccueilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAccueilMouseExited
       if(isSideSelected != 1)
           labAccueil.setForeground(new Color(179, 179, 179));
    }//GEN-LAST:event_labAccueilMouseExited

    private void labRechercherMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRechercherMouseExited
        if(isSideSelected != 2)
            labRechercher.setForeground(new Color(179, 179, 179));
    }//GEN-LAST:event_labRechercherMouseExited

    private void labBiblioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBiblioMouseExited
        if(isSideSelected != 3)
            labBiblio.setForeground(new Color(179, 179, 179));
    }//GEN-LAST:event_labBiblioMouseExited

    private void labPlaylistMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labPlaylistMouseExited
        if(isSideSelected != 4){
         labPlaylist.setForeground(new Color(179, 179, 179));
         icoPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-new-27(1).png")));
        }
            
    }//GEN-LAST:event_labPlaylistMouseExited

    private void labTitreslikésMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTitreslikésMouseExited
        if(isSideSelected != 5){
           labTitreslikés.setForeground(new Color(179, 179, 179));
           icoTitreslikés.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-27(1).png")));
        }
            
    }//GEN-LAST:event_labTitreslikésMouseExited

    private void labRechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labRechercherMouseClicked
        refreshSide(isSideSelected);
        labRechercher.setForeground(Color.WHITE);
        icoRechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-search-27.png")));
        isSideSelected = 2;
    }//GEN-LAST:event_labRechercherMouseClicked

    private void labAccueilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labAccueilMouseClicked
        refreshSide(isSideSelected);
        labAccueil.setForeground(Color.WHITE);
        icoAccueil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-home-27.png")));
        isSideSelected = 1;
    }//GEN-LAST:event_labAccueilMouseClicked

    private void labBiblioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labBiblioMouseClicked
        refreshSide(isSideSelected);
        labBiblio.setForeground(Color.WHITE);
        icoBiblio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-music-library-27.png")));
        isSideSelected = 3;
    }//GEN-LAST:event_labBiblioMouseClicked

    private void labPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labPlaylistMouseClicked
        refreshSide(isSideSelected);
        labPlaylist.setForeground(Color.WHITE);
        icoPlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-add-new-27.png")));
        isSideSelected = 4;
    }//GEN-LAST:event_labPlaylistMouseClicked

    private void labTitreslikésMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTitreslikésMouseClicked
        refreshSide(isSideSelected);
        labTitreslikés.setForeground(Color.WHITE);
        icoTitreslikés.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-favorite-27.png")));
        isSideSelected = 5;
    }//GEN-LAST:event_labTitreslikésMouseClicked

    private void buttonLike1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLike1MouseEntered
        buttonLike1.setBackground(new Color(246,246,246));
        buttonLike1.setPreferredSize(new Dimension(145, 50));
        buttonLike1.setMaximumSize(buttonLike1.getPreferredSize()); 
        buttonLike1.setMinimumSize(buttonLike1.getPreferredSize());
        
        gothamLabel8.setFont(new Font(gothamLabel8.getFont().getName(), Font.BOLD, 16));
        
        buttonLike1.revalidate();
        
    }//GEN-LAST:event_buttonLike1MouseEntered

    private void buttonLike1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLike1MouseExited
        buttonLike1.setBackground(Color.WHITE);
        buttonLike1.setPreferredSize(new Dimension(143, 45));
        buttonLike1.setMaximumSize(buttonLike1.getPreferredSize()); 
        buttonLike1.setMinimumSize(buttonLike1.getPreferredSize());
        
        gothamLabel8.setFont(new Font(gothamLabel8.getFont().getName(), Font.BOLD, 15));
        
        buttonLike1.revalidate();
    }//GEN-LAST:event_buttonLike1MouseExited

    private void reculerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reculerMouseClicked
        accueilPanel.setVisible(true);
        accueilPanel.setEnabled(true);
        headerPanel.setBackground(new Color(30,30,30));
    }//GEN-LAST:event_reculerMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        String iconfilename = jLabel8.getIcon().toString();
        String fileName = iconfilename.substring(iconfilename.lastIndexOf("/"  ) + 1);
        if("icons8-play-35.png".equals(fileName))//Si c'est à la pause
        {
           jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-pause-35.png")));
            
            player.setFile(audioFile);	
            player.init();
            audioPlayerThread = new Thread(player);
            audioPlayerThread.start();
        }
        else //Si ça joue
        {
            jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/prestige/icons/icons8-play-35.png")));
            player.stop();
        }
    }//GEN-LAST:event_jLabel8MouseClicked

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("System".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
         //UI color hacks for tabs -- must fire early

            UIManager.put("TabbedPane.borderColor", new Color(30,30,30));

            UIManager.put("TabbedPane.darkShadow", new Color(30,30,30));

            UIManager.put("TabbedPane.borderHightlightColor", new Color(30,30,30));

    // ...lots of other hidden settings...


        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private com.prestige.swing.accountPanel accountPanel1;
    public static javax.swing.JPanel accueilPanel;
    public static javax.swing.JPanel albumPanel;
    private com.prestige.swing.circleButtonLike avancer;
    private com.prestige.swing.ButtonLike buttonLike1;
    private com.prestige.album.downhero.downHero downHero2;
    private downPanel.DownPanel downPanel1;
    private com.prestige.album.downtable.downtable downtable1;
    private com.prestige.fonts.GothamLabel gothamLabel1;
    private com.prestige.fonts.GothamLabel gothamLabel10;
    private com.prestige.fonts.GothamLabel gothamLabel2;
    private com.prestige.fonts.GothamLabel gothamLabel3;
    private com.prestige.fonts.GothamLabel gothamLabel4;
    private com.prestige.fonts.GothamLabel gothamLabel5;
    private com.prestige.fonts.GothamLabel gothamLabel6;
    private com.prestige.fonts.GothamLabel gothamLabel7;
    private com.prestige.fonts.GothamLabel gothamLabel8;
    private com.prestige.fonts.GothamLabel gothamLabel9;
    public static javax.swing.JPanel headerPanel;
    private com.prestige.album.hero.heroPanel heroPanel1;
    private javax.swing.JLabel icoAccueil;
    private javax.swing.JLabel icoBiblio;
    private javax.swing.JLabel icoPlaylist;
    private javax.swing.JLabel icoRechercher;
    private javax.swing.JLabel icoTitreslikés;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private com.prestige.fonts.GothamLabel labAccueil;
    private com.prestige.fonts.GothamLabel labBiblio;
    private com.prestige.fonts.GothamLabel labPlaylist;
    private com.prestige.fonts.GothamLabel labRechercher;
    private com.prestige.fonts.GothamLabel labTitreslikés;
    public static com.prestige.subButton.outterPanel outterPanel1;
    private com.prestige.accueil.subSection.panelImage panelImage1;
    public static com.prestige.accueil.Container.PanelItem panelItem;
    private com.prestige.album.container.PanelItem panelItem1;
    private com.prestige.swing.circleButtonLike reculer;
    private com.prestige.swing.RondPanel rondPanel13;
    private com.prestige.swing.RondPanel rondPanel14;
    private com.prestige.swing.RondPanel rondPanel15;
    private com.prestige.swing.RondPanel rondPanel16;
    private com.prestige.swing.RondPanel rondPanel17;
    private com.prestige.swing.RondPanel rondPanel18;
    private com.prestige.swing.RondPanel rondPanel2;
    private com.prestige.swing.RondPanel rondPanel3;
    private com.prestige.swing.RondPanel rondPanel4;
    private com.prestige.swing.RoundRectangle roundRectangle2;
    private com.prestige.album.tableau.sectionTableau sectionTableau1;
    private com.prestige.winButtons.winButtons winButtons2;
    // End of variables declaration//GEN-END:variables
}
