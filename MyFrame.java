import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyFrame extends JFrame {
	private int b=-1,ch=0,ck=0,img=0,level=0,t=2,newpanel=0,fragmentbig;
	
	private JToolBar jToolBar=new JToolBar("�u��c",JToolBar.VERTICAL);
	
	private Color   colors[ ]                           = new Color            [ 17 ];
	private JButton erasersizebutton[ ] 				= new JButton          [  4 ];
	private JButton spraysizebutton[ ] 					= new JButton          [  3 ];
	private JButton brushsizebutton[ ]					= new JButton          [  4 ];
	private JButton linesizebutton[ ] 					= new JButton          [  5 ];
	private JButton arrowheadsizebutton[ ] 				= new JButton          [  5 ];
	private JButton rectsizebutton[ ] 					= new JButton          [  4 ];
	private JButton ovalsizebutton[ ] 					= new JButton          [  4 ];
	private JButton roundrectsizebutton[ ] 				= new JButton          [  4 ];
	private JButton circlesizebutton[ ] 				= new JButton          [  4 ];
	private JButton squaresizebutton[ ] 			    = new JButton          [  4 ];
	private JButton parallelogramsizebutton[ ] 			= new JButton          [  3 ];
	private JButton trapezoidsizebutton[ ] 				= new JButton          [  3 ];
	private JButton rhombussizebutton[ ] 				= new JButton          [  3 ];
	private JButton octanglesizebutton[ ] 				= new JButton          [  3 ];
	private JButton right_angled_trianglesizebutton[ ] 	= new JButton          [  3 ];
	private JButton hexagonsizebutton[ ] 				= new JButton          [  3 ];
	private JButton crosssizebutton[ ] 					= new JButton          [  3 ];
	private JButton pentagonsizebutton[ ] 				= new JButton          [  3 ];
	private JButton trianglesizebutton[ ] 				= new JButton          [  3 ];
	private JButton cylinder[ ] 			        	= new JButton          [  3 ];
	private JToggleButton toolbutton[ ] 						= new JToggleButton          [ 21 ];
	private JCheckBoxMenuItem item6_2[ ]                = new JCheckBoxMenuItem[  3 ];
	private JCheckBoxMenuItem item2[ ]                  = new JCheckBoxMenuItem[  4 ];
	private JLabel filllabel[ ]                         = new JLabel           [  2 ];
	private JLabel blanklabel[ ]                        = new JLabel           [  2 ];
	private JMenu menu[ ]                               = new JMenu            [  8 ];
	private JMenu item6[ ]                              = new JMenu            [  2 ];
	private JMenuItem item0[ ]                          = new JMenuItem        [  5 ];
	private JMenuItem item1[ ]                          = new JMenuItem        [  2 ];
	private JMenuItem item3[ ]                          = new JMenuItem        [  1 ];
	private JMenuItem item4[ ]                          = new JMenuItem        [  1 ];
	private JMenuItem item5[ ]                          = new JMenuItem        [  1 ];
	private JMenuItem item6_1[ ]                        = new JMenuItem        [  2 ];
	private JMenuItem item7[ ]                          = new JMenuItem        [  2 ];
	private JPanel  panel[]                             = new JPanel           [ 54 ];
	private JTextField colorbutton[ ] 					= new JTextField       [ 16 ];
	private JTextField filltextfield[ ]                 = new JTextField       [  2 ]; 
	private MyShape  back[]                             = new MyShape          [10000];
	private Painter Bpanel[]                            = new Painter          [ 50 ];
	
	private JButton backbutton;
	private JButton nextbutton;
	private JButton fragmentbackbutton;
	private JButton fragmentnextbutton;
	private JLabel  statelabel; 
	private JLabel toollabel;
	private JLabel rightcolorlabel;
	private JLabel leftcolorlabel;
	private JLabel fragmentlinebiglabel;
	private JTextField rightcolortextfield; 
	private JTextField leftcolortextfield; 
	private JTextField coordtetextfield; 
	private JTextField areatetextfield; 
	private JTextField tooltextfield; 
	private JTextField fragmenttextfield;
	private JTabbedPane tabbedPane;
	private JTabbedPane tabbedPane2;
	private JMenuBar bar; 
	private ImageIcon bug;
	private ButtonGroup radiogroup;
	private ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textarea1; 
	private JTextArea textarea2; 
	private JSpinner fragmentlinebig;
	private MyShape fragment;
	private boolean filled;
	
	public MyFrame(String caption){
		super( caption );
		
		declare( );			/*�ŧi����*/
		set( );				/*�]�w��l*/
		setpanellayout( );	/*�]�w�ƦC*/
		setpanelcolor( );	/*�]�w�C��*/
		Add( );				/*�[�J*/
		handler( );			/*��ť*/
		
	  	add( panel[ 0 ] );
   } 
	
	public void declare( ){
		for(int i=0 ; i < panel.length                           ; i++ ){ panel[i]                           = new JPanel    ( ); }
		for(int i=0 ; i < Bpanel.length                          ; i++ ){ Bpanel[i]                          = new Painter   ( ); }
		for(int i=0 ; i < colorbutton.length                     ; i++ ){ colorbutton[i]                     = new JTextField(2); 
			                                                              colorbutton[i].setEditable( false ); }
		for(int i=0 ; i < colors.length                          ; i++ ){ colors[i]				             = new Color (0,0,0); }
		for(int i=0 ; i < erasersizebutton.length                ; i++ ){ erasersizebutton[i] 	             = new JButton   ( ); }
		for(int i=0 ; i < spraysizebutton.length                 ; i++ ){ spraysizebutton[i] 		         = new JButton   ( ); }
		for(int i=0 ; i < brushsizebutton.length                 ; i++ ){ brushsizebutton[i] 		         = new JButton   ( ); }
		for(int i=0 ; i < linesizebutton.length                  ; i++ ){ linesizebutton[i] 		         = new JButton   ( ); }
		for(int i=0 ; i < arrowheadsizebutton.length             ; i++ ){ arrowheadsizebutton[i] 		     = new JButton   ( ); }
		for(int i=0 ; i < rectsizebutton.length                  ; i++ ){ rectsizebutton[i] 		         = new JButton   ( ); }
		for(int i=0 ; i < ovalsizebutton.length                  ; i++ ){ ovalsizebutton[i] 		         = new JButton   ( ); }
		for(int i=0 ; i < roundrectsizebutton.length             ; i++ ){ roundrectsizebutton[i] 	         = new JButton   ( ); }
		for(int i=0 ; i < circlesizebutton.length                ; i++ ){ circlesizebutton[i] 	             = new JButton   ( ); }
		for(int i=0 ; i < squaresizebutton.length                ; i++ ){ squaresizebutton[i]                = new JButton   ( ); }
		for(int i=0 ; i < parallelogramsizebutton.length         ; i++ ){ parallelogramsizebutton[i]         = new JButton   ( ); }
		for(int i=0 ; i < trapezoidsizebutton.length             ; i++ ){ trapezoidsizebutton[i]  	 	     = new JButton   ( ); }
		for(int i=0 ; i < rhombussizebutton.length               ; i++ ){ rhombussizebutton[i]  	 	     = new JButton   ( ); }
		for(int i=0 ; i < octanglesizebutton.length              ; i++ ){ octanglesizebutton[i] 	 	 	 = new JButton   ( ); }
		for(int i=0 ; i < right_angled_trianglesizebutton.length ; i++ ){ right_angled_trianglesizebutton[i] = new JButton   ( ); }
		for(int i=0 ; i < hexagonsizebutton.length               ; i++ ){ hexagonsizebutton[i] 	             = new JButton   ( ); }
		for(int i=0 ; i < crosssizebutton.length                 ; i++ ){ crosssizebutton[i] 	             = new JButton   ( ); }
		for(int i=0 ; i < pentagonsizebutton.length              ; i++ ){ pentagonsizebutton[i] 	         = new JButton   ( ); }
		for(int i=0 ; i < trianglesizebutton.length              ; i++ ){ trianglesizebutton[i] 	         = new JButton   ( ); }
		for(int i=0 ; i < cylinder.length                        ; i++ ){cylinder[i] 	                     = new JButton   ( ); }
		for(int i=0 ; i < filllabel.length                       ; i++ ){ filllabel[i] 		                 = new JLabel    ( ); }
		for(int i=0 ; i < filltextfield.length                   ; i++ ){ filltextfield[i]                   = new JTextField( ); }
		for(int i=0 ; i < menu.length                            ; i++ ){ menu[i] 		                     = new JMenu     ( ); }
		for(int i=0 ; i < item0.length                           ; i++ ){ item0[i] 		                     = new JMenuItem ( ); }
		for(int i=0 ; i < item1.length                           ; i++ ){ item1[i] 		                     = new JMenuItem ( ); }
		for(int i=0 ; i < item2.length                           ; i++ ){ item2[i]                           = new JCheckBoxMenuItem( ); }	
		for(int i=0 ; i < item3.length                           ; i++ ){ item3[i] 		                     = new JMenuItem ( ); }
		for(int i=0 ; i < item4.length                           ; i++ ){ item4[i] 		                     = new JMenuItem ( ); }
		for(int i=0 ; i < item5.length                           ; i++ ){ item5[i] 		                     = new JMenuItem ( ); }
		for(int i=0 ; i < blanklabel.length                      ; i++ ){ blanklabel[i]                      = new JLabel    ( ); }
		for(int i=0 ; i < toolbutton.length                      ; i++ ){ toolbutton[i]                      = new JToggleButton   ( ); }
		backbutton = new JButton();
		nextbutton = new JButton();
		fragmentbackbutton = new JButton();
		fragmentnextbutton = new JButton();
		
		bar = new JMenuBar( ); 
		
	    toollabel       = new JLabel( );
		rightcolorlabel = new JLabel( );
		leftcolorlabel  = new JLabel( );
		statelabel      = new JLabel( );
		fragmentlinebiglabel = new JLabel();
		
		rightcolortextfield = new JTextField ( );
		leftcolortextfield  = new JTextField ( );
		coordtetextfield    = new JTextField ( );
		areatetextfield     = new JTextField ( );
		tooltextfield       = new JTextField ( ); 
		fragmenttextfield   = new JTextField();
		
		tabbedPane          = new JTabbedPane( );
		tabbedPane2         = new JTabbedPane();
		
		radiogroup = new ButtonGroup();

		textarea1 = new JTextArea();
		textarea2 = new JTextArea();
		
		fragmentlinebig = new JSpinner();
	}
	public void set( ){
		colors[ 0] = new Color(   0,   0,   0);
		colors[ 1] = new Color( 128, 128, 128);
		colors[ 2] = new Color( 128,   0,   0);
		colors[ 3] = new Color( 128, 128,   0);
		colors[ 4] = new Color(   0, 128,   0);
		colors[ 5] = new Color(   0, 128, 128);
		colors[ 6] = new Color(   0,   0, 128);
		colors[ 7] = new Color( 128,   0, 128);
		colors[ 8] = new Color( 255, 255, 255);
		colors[ 9] = new Color( 192, 192, 192);
		colors[10] = new Color( 255,   0,   0);
		colors[11] = new Color( 255, 255,   0);
		colors[12] = new Color(   0, 255,   0);
		colors[13] = new Color(   0, 255, 255);
		colors[14] = new Color(   0,   0, 255);
		colors[15] = new Color( 255,   0, 255);
		
		for(int i = 0 ; i < colorbutton.length ; i++ ){ colorbutton[i].setBackground(colors[i]); }
		
		rightcolorlabel      = new JLabel("�z�k��ҿ諸�C��:");
		leftcolorlabel       = new JLabel("�z����ҿ諸�C��:");
		statelabel           = new JLabel("�p�ݻ����A�Ы��@�U[����]�\�����[�����D�D]");
		toollabel            = new JLabel("�u��:");
		filllabel[0]         = new JLabel("��[�w�w�u��]�C          ");
		filllabel[1]         = new JLabel("<=>");
		fragmentlinebiglabel = new JLabel("��ܤj�p : ");
		
		rightcolortextfield = new JTextField( 3); 
		leftcolortextfield  = new JTextField( 3); 
		coordtetextfield    = new JTextField( 6);
		areatetextfield     = new JTextField( 6);
		tooltextfield       = new JTextField( 6);
		filltextfield[0]    = new JTextField( 3); 
		filltextfield[1]    = new JTextField( 3); 
		fragmenttextfield   = new JTextField(20);
		fragmenttextfield.setText(String.format("��%d�h",1));
		tooltextfield.setText( "��" );
		rightcolortextfield.setBackground( new Color(255,255,255));
		leftcolortextfield.setBackground(  new Color(0,0,0));
		coordtetextfield.setBackground(    new Color(215,215,215));
		areatetextfield.setBackground(     new Color(215,215,215));
		filltextfield[0].setBackground(    new Color(0,0,0));
		filltextfield[1].setBackground(    new Color(255,255,255));
		fragmenttextfield.setBackground(   new Color(215,215,215));
		rightcolortextfield.setEditable( false );
		leftcolortextfield.setEditable(  false );
		coordtetextfield.setEditable(    false );
		areatetextfield.setEditable(     false );
		tooltextfield.setEditable(       false );
		filltextfield[0].setEditable(    false );
		filltextfield[1].setEditable(    false );
		fragmenttextfield.setEditable(   false );
		
		for(int i=0 ; i<toolbutton.length;i++){
			toolbutton[i]=new JToggleButton(new ImageIcon( getClass().getResource(String.format("0%d.gif",i)) ));
			if(i==2){ toolbutton[i].setBackground(new Color(160,160,160)); }
			else{     toolbutton[i].setBackground(new Color(215,215,215)); }
		}
		for(int i = 0 ; i < erasersizebutton.length                ; i++ ){ erasersizebutton[i]                = new JButton( new ImageIcon( getClass().getResource( String.format( "1%d.gif" , i)) ));
			                                                                brushsizebutton[i]                 = new JButton( new ImageIcon( getClass().getResource( String.format( "1%d.gif" , i)) )); }
		for( int i = 0 ; i < spraysizebutton.length                ; i++ ){ spraysizebutton[i]                 = new JButton( new ImageIcon( getClass().getResource( String.format( "2%d.gif" , i)) )); }
		for( int i = 0 ; i < linesizebutton.length                 ; i++ ){ linesizebutton[i]                  = new JButton( new ImageIcon( getClass().getResource( String.format( "3%d.gif" , i)) )); }
		for( int i = 0 ; i < arrowheadsizebutton.length            ; i++ ){ arrowheadsizebutton[i]             = new JButton( new ImageIcon( getClass().getResource( String.format( "4%d.gif" , i)) )); }
		for( int i = 0 ; i < rectsizebutton.length                 ; i++ ){ rectsizebutton[i]                  = new JButton( new ImageIcon( getClass().getResource( String.format( "5%d.gif" , i)) )); }
		for( int i = 0 ; i < ovalsizebutton.length                 ; i++ ){ ovalsizebutton[i]                  = new JButton( new ImageIcon( getClass().getResource( String.format( "6%d.gif" , i)) )); }
		for( int i = 0 ; i < roundrectsizebutton.length            ; i++ ){ roundrectsizebutton[i]             = new JButton( new ImageIcon( getClass().getResource( String.format( "7%d.gif" , i)) )); }
		for( int i = 0 ; i < circlesizebutton.length               ; i++ ){ circlesizebutton[i]                = new JButton( new ImageIcon( getClass().getResource( String.format( "8%d.gif" , i)) )); }
		for( int i = 0 ; i < squaresizebutton.length               ; i++ ){ squaresizebutton[i]                = new JButton( new ImageIcon( getClass().getResource( String.format( "9%d.gif" , i)) )); }
		for( int i = 0 ; i < parallelogramsizebutton.length        ; i++ ){ parallelogramsizebutton[i]         = new JButton( new ImageIcon( getClass().getResource( String.format( "10%d.gif" , i)) )); }
		for( int i = 0 ; i < trapezoidsizebutton.length            ; i++ ){ trapezoidsizebutton[i]             = new JButton( new ImageIcon( getClass().getResource( String.format( "11%d.gif" , i)) )); }
		for( int i = 0 ; i < rhombussizebutton.length              ; i++ ){ rhombussizebutton[i]               = new JButton( new ImageIcon( getClass().getResource( String.format( "12%d.gif" , i)) )); }
		for( int i = 0 ; i < octanglesizebutton.length             ; i++ ){ octanglesizebutton[i]              = new JButton( new ImageIcon( getClass().getResource( String.format( "13%d.gif" , i)) )); }
		for( int i = 0 ; i < right_angled_trianglesizebutton.length; i++ ){ right_angled_trianglesizebutton[i] = new JButton( new ImageIcon( getClass().getResource( String.format( "14%d.gif" , i)) )); }
		for( int i = 0 ; i < hexagonsizebutton.length              ; i++ ){ hexagonsizebutton[i]               = new JButton( new ImageIcon( getClass().getResource( String.format( "15%d.gif" , i)) )); }
		for( int i = 0 ; i < crosssizebutton.length                ; i++ ){ crosssizebutton[i]                 = new JButton( new ImageIcon( getClass().getResource( String.format( "16%d.gif" , i)) )); }
		for( int i = 0 ; i < pentagonsizebutton.length             ; i++ ){ pentagonsizebutton[i]              = new JButton( new ImageIcon( getClass().getResource( String.format( "17%d.gif" , i)) )); }
		for( int i = 0 ; i < trianglesizebutton.length             ; i++ ){ trianglesizebutton[i]              = new JButton( new ImageIcon( getClass().getResource( String.format( "18%d.gif" , i)) )); }
		for( int i = 0 ; i < cylinder.length                       ; i++ ){ cylinder[i]                        = new JButton( new ImageIcon( getClass().getResource( String.format( "21%d.gif" , i)) )); }
		backbutton         = new JButton(new ImageIcon( getClass().getResource(String.format("192.gif")) ));
		nextbutton         = new JButton(new ImageIcon( getClass().getResource(String.format("193.gif")) ));
		fragmentbackbutton = new JButton("�^�W�@�ӹ�");
		fragmentnextbutton = new JButton("���U�@�ӹ�");
		backbutton.setBackground(        new Color(215,215,215));
		nextbutton.setBackground(        new Color(215,215,215));
		fragmentbackbutton.setBackground(new Color(215,215,215));
		fragmentnextbutton.setBackground(new Color(215,215,215));
		
		textarea1 = new JTextArea(75,30);
		textarea2 = new JTextArea(35,30);
		textarea1.setText(" ���{�������|�Ӱϰ� :  1.�C���   2.�u���   3.�i���u��ϧΰ�   4.���ϡB���A�C��\n\n 1.�C���\n\n     �C��Ϧb�{������e���U��(�n��)�A�@�@��16���C��A�i�H���N���A�C����s\n     �䤤�\�঳ : 1.�C���ܦ��Ӥ����ƹ�������B�k����A�b�e���W��U����B�|\n     ��ܥثe�����(�W�B�U���)2. ��n�i�����ɥi�H�I��U�����C����s(�P�p�e�a\n     �\��ۦP)\n\n\n 2.�u���\n\n     �u��Ϧb�{������e��������(���)�A�@�@��6�إ\����A���I�Υ���\����ɷ|\n     �A���Ϫ��U��X�{�������\�� (�p:�ʡB��)�F �\������O�� 1.����� 2.�Q�� \n     3.��4.���� 5.���u 6.�b�Y�C\n    \n     �u��ϥ\���仡��:\n         1.���I���������ɡA�|�X�{�|�ؤj�p��ܶs�A��������C��O�M�w��ƹ���\n            �k��(���S��P�p�e�a�ۦP)�C\n         2.���I���Q����ɡA�|�X�{�T�ؽd���ܡC\n         3.���I������ɡA���|�X�{����j�p���(���S��P�p�e�a�ۦP)�C\n         4.���I��������ɡA�|�X�{�M������@�˪��|�ؤj�p��ܶs�C\n         5.���I�����u��ɡA�|�X�{���زʡB�ӿ�ܶs�C\n         6.���I���b�Y��ɡA�|�X�{���زʡB�ӿ�ܶs�C\n\n\n 3.�i���u��ϧΰ�\n\n     �i���u��ϧΰϦb�{������e�����k��(�F��)�A���Ϥ@�@����ؿ�� 1.�h�䫬 \n     2.�H���\n\n     �h�䫬����:\n         ���ϥ�����15�عϧΡA���O������ΡB��ꫬ�B�ꨤ���B(��)�ꫬ�B(��)��ΡB\n         ����|��ΡB��ΡB�٧ΡB�K�����B�����T���ΡB�������B�Q�r���B�������B\n         �T���ΡB��W���F���I�����ΡB��ꫬ�B�ꨤ���B(��)�ꫬ�B(��)��ήɷ|\n         ��\"��R���\��\"�Ӷ�R�C�⪺��ܦb�󥪥k�� ( �Ҧp:����>�¡B�k��>��;�X�{\n         �Ѷ¨�ժ����h)�A�ӲʡB�Ӫ��\��C�ӹϧζ��Ҧ��C\n     �H��ϻ���:\n        ���I�ο��(�H����)�ɡA�\��N�۰ʸ��ܪ��u(�ϥΪ̥i�ۤv�諾�u)�A��e��\n        ���u��A���I��U�@�B�A���I�粒�U�@�B��Y�i�ݨ�λ��j���槹���H�ιϮסC\n        �b�o�ӿ�椤�]�i�H�սu���ʲ�(��椤��)�M�C��(�I����)�C\n\n\n 4.���ϡB���A�C��\n\n     ���Ϧb�{������e�����W��(�F��)�B���A�C�ϵ{������e�����̤U��(�̫n��)�C\n\n     ���ϻ���:\n         ���ϥѥ��ӥk���O���ɮסB�s��B�˵��B�v���B��m�B�����BSettings�B\n         Programs�C\n        \n         �ɮ��仡��:\n             �����e�@�@���}�s�ɮסB�}�����ɡB�x�s�ɮסB�t�s�s�ɡB���}�A���Ϫ�\n             �}�s�ɮסB�}�����ɡB���}�ҥi�H�ϥΡA�i�H�}�ҹϤ��ɡA���x�s�\���\n             �|�������C\n         �s���仡��:\n              �����e�@�@���_��B���ƨ�إ\��C\n         �˵��仡��:\n              �����e�i�H�Ŀ�O�_��ܤu��c(�u���)�B���(�C���)�B���A�C�B�i��\n          �\��C��C\n         �v���仡��:\n              �����e���M���M���v�����\��A���I������ɫh�|���X��ܲM�����@�ϼh\n              �����C(���:�Ъ`�N�e��)\n         ��m�仡��:\n              �����e����ܦ�m���\��A���I���ɫh�|���X���A����ܬO���䪺�C��\n              (������O�k��)�C\n         �����仡��:\n              �����e�����󦹵{������T�C\n         Settings�B Programs�仡��:\n              �����e�h�O�@�~�n�D���e�C\n\n     ���A�C�ϻ���:\n         ���ϥi�Ӥ�����ϡA�@�Ϧb���ϤU��B�t�@�Ϧb�C��ϤU��C���Ϸ|��ܨϥΪ�\n         ���ϥΪ��A�C�b�C��ϤU�誺���A�C�|��ܷƹ��b�e�����y�СA����ܮy�Ъ��W��\n         �M�p�e�a�@�ˡC");
   		textarea2.setText(" �����׻���:\n \n     �o�ӵ{���������׻����ڤ����ⳡ���ӻ���!\n \n\n     1.�������\��:\n\n         �b���椤�����ڤޥH���ƪ��\��O��ƹ��b������I��U��\n\n         �|���X�@�ӵ������A����h���C���ܡA��b�ڪ��e�����A\n\n         �ƹ������k����O�i�H�����P���C��!�]�N�O���i�H�Υk��\n\n         ���F�A�ӬO�ڪ��^��W�@�B�A��@�}�l���S��������ϫ�\n\n         �e�A�p�G��ƹ��������W�A����O���|�����󪺤�����(��\n\n         ��^��W�@�B)�A�p�G���ܹϮת��ܡA��ƹ��@�����W�ɡA\n\n         �h���C�⪺�ܤơC�b�o�����n�D���ڦۤv�t�~�Ǩ��L���y�k\n\n         �p:�}�����ɡA���{���i�H�}�ҥ��󪺹Ϥ��ɡC�٦��@�ǲӳ�\n\n         ���p�\��A�p:��Shift+E���ܥi�H�}�ҿ���...!\n\n\n     2.�|���������\��:\n\n         ��󥻵{���঳�@�ǩ|���������\��A�p�s��!�䤤�٦��^��W\n\n         �@�B�o�ӥ\���M���p���D(��^�W�@�B��b�e�Ϥ��᪺�^�W�@\n\n         �B)�A�������~�j�P���t���h�����F�C\n");
   		textarea1.setFocusable( false );
   		textarea2.setFocusable( false );
		fragmentlinebig.setValue(new Integer(1));
   		
		setJMenuBar( bar ); 
	
		menu[0] = new JMenu( "�ɮ� (F)" );
		menu[1] = new JMenu( "�s�� (E)" ); 
		menu[2] = new JMenu( "�˵� (V)" ); 
		menu[3] = new JMenu( "�v�� (I)" ); 
		menu[4] = new JMenu( "��m (c)" ); 
		menu[5] = new JMenu( "����(H)" ); 
		menu[6] = new JMenu( "Settings (S)" ); 
		menu[7] = new JMenu( "Programs (P)" ); 
		menu[0].setMnemonic( 'F' ); 
		menu[1].setMnemonic( 'E' );
		menu[2].setMnemonic( 'V' );
		menu[3].setMnemonic( 'I' );
		menu[4].setMnemonic( 'c' );
		menu[5].setMnemonic( 'H' );
		menu[6].setMnemonic( 'S' );
		menu[7].setMnemonic( 'P' );
		
		item6[0] = new JMenu( "Colors C)" ); 
		item6[1] = new JMenu( "Toolbox (T)" ); 
		item6[0].setMnemonic( 'C' );
		item6[1].setMnemonic( 'T' );
		
		item0[0] = new JMenuItem( "�}�s�ɮ� (N)" );
		item0[1] = new JMenuItem( "�}������ (O)" );
		item0[2] = new JMenuItem( "�x�s�ɮ� (S)" );
		item0[3] = new JMenuItem( "�t�s�s�� (A)" );
		item0[4] = new JMenuItem( "���} (X)" );
		item0[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("78"), ActionEvent.CTRL_MASK));
		item0[1].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("81"), ActionEvent.CTRL_MASK));
		item0[2].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("83"), ActionEvent.CTRL_MASK));
		item0[3].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("65"), ActionEvent.CTRL_MASK));
		item0[4].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("88"), ActionEvent.CTRL_MASK));
		item0[0].setMnemonic( 'N' ); 
		item0[1].setMnemonic( 'O' ); 
		item0[2].setMnemonic( 'S' ); 
		item0[3].setMnemonic( 'A' ); 
		item0[4].setMnemonic( 'X' ); 
		
		item1[0] = new JMenuItem( "�_�� (U)" );
		item1[1]= new JMenuItem( "���� (R)" ); 
		item1[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("90"), ActionEvent.CTRL_MASK));
		item1[1].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("89"), ActionEvent.CTRL_MASK));
		item1[0].setMnemonic( 'U' ); 
		item1[1].setMnemonic( 'R' );
		item1[0].setEnabled(false);
		item1[1].setEnabled(false);
		
		item2[0] = new JCheckBoxMenuItem( "�u��c (T)" );
		item2[1] = new JCheckBoxMenuItem( "��� (C)" );
		item2[2] = new JCheckBoxMenuItem( "���A�C (D)" );
		item2[3] = new JCheckBoxMenuItem( "�i���\��C�� (G)" );
		item2[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("84"), ActionEvent.CTRL_MASK));
		item2[1].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("76"), ActionEvent.CTRL_MASK));
		item2[2].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("68"), ActionEvent.CTRL_MASK));
		item2[3].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("71"), ActionEvent.CTRL_MASK));
		item2[0].setMnemonic( 'T' ); 
		item2[1].setMnemonic( 'C' );
		item2[2].setMnemonic( 'D' );
		item2[3].setMnemonic( 'G' );
		item2[0].setSelected(true);
		item2[1].setSelected(true);
		item2[2].setSelected(true);
		item2[3].setSelected(true);
		
		item3[0]= new JMenuItem( "�M���v�� (C)" ); 
		item3[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("67"), ActionEvent.SHIFT_MASK));
		item3[0].setMnemonic( 'C' );
		item3[0].setEnabled(false);
		
		item4[0]= new JMenuItem( "�s���m (E)" ); 
		item4[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("69"), ActionEvent.SHIFT_MASK));
		item4[0].setMnemonic( 'E' );
		item4[0].setEnabled(true);
		
		item5[0] = new JMenuItem( "����p�p�e�a (A)" );
		item5[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("65"), ActionEvent.SHIFT_MASK));
		item5[0].setMnemonic( 'A' ); 
		
		
		item6_1[0] = new JMenuItem( "Foreground (F)" );
		item6_1[1] = new JMenuItem( "Background (B)" );
		
		item6_1[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("70"), ActionEvent.CTRL_MASK));
		item6_1[1].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("66"), ActionEvent.CTRL_MASK));
		item6_1[0].setMnemonic( 'F' );
		item6_1[1].setMnemonic( 'B' ); 
		
		item6_2[0] = new JCheckBoxMenuItem( "Flowchard (F)" );
		item6_2[1] = new JCheckBoxMenuItem( "Advanced (A)" );
		item6_2[2] = new JCheckBoxMenuItem( "All            (L)" );
		item6_2[0].setSelected(false);
		item6_2[1].setSelected(false);
		item6_2[2].setSelected(true);
		item6_2[0].setMnemonic( 'F' );
		item6_2[1].setMnemonic( 'A' );
		item6_2[2].setMnemonic( 'L' );
		  	
		for(int i=0;i < item6_2.length;i++){
			radiogroup.add(item6_2[i]); 
		}	  	
		 	
		item7[0] = new JMenuItem( "Help (H)" );
		item7[1] = new JMenuItem( "Done (D)" );
		item7[0].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("72"), ActionEvent.CTRL_MASK));
		item7[1].setAccelerator(KeyStroke.getKeyStroke(Integer.parseInt("68"), ActionEvent.SHIFT_MASK));
		item7[0].setMnemonic( 'H' ); 
		item7[1].setMnemonic( 'D' );
		  	
		
	}
	public void setpanellayout(){
		panel[11].setLayout( new FlowLayout( ) );
		panel[12].setLayout( new FlowLayout( ) );
		panel[14].setLayout( new FlowLayout( ) );
		panel[16].setLayout( new FlowLayout( ) );
		panel[18].setLayout( new FlowLayout( ) );
		panel[20].setLayout( new FlowLayout( ) );
		panel[25].setLayout( new FlowLayout( ) );
		panel[27].setLayout( new FlowLayout( ) );
		panel[28].setLayout( new FlowLayout( ) );
		panel[30].setLayout( new FlowLayout( ) );
		panel[32].setLayout( new FlowLayout( ) );
		panel[34].setLayout( new FlowLayout( ) );
		panel[36].setLayout( new FlowLayout( ) );
		panel[37].setLayout( new FlowLayout( ) );
		panel[43].setLayout( new FlowLayout( ) );
		panel[45].setLayout( new FlowLayout( ) );
		panel[46].setLayout( new FlowLayout( ) );
		panel[48].setLayout( new FlowLayout( ) );
		panel[50].setLayout( new FlowLayout( ) );
		panel[52].setLayout( new FlowLayout( ) );
		panel[53].setLayout( new FlowLayout( ) );
		
		panel[ 0].setLayout( new BorderLayout( 4, 4) );
		panel[ 1].setLayout( new BorderLayout( 2, 2) );
		panel[ 2].setLayout( new BorderLayout( 4, 4) );
		panel[ 3].setLayout( new BorderLayout( 2, 2) );
		panel[ 4].setLayout( new BorderLayout( 2, 2) );
		panel[ 6].setLayout( new BorderLayout( 2, 2) );
		panel[ 8].setLayout( new BorderLayout( 2, 2) );
		panel[10].setLayout( new BorderLayout( 2, 2) );
		panel[13].setLayout( new BorderLayout( 2, 2) );
		panel[15].setLayout( new BorderLayout( 2, 2) );
		panel[17].setLayout( new BorderLayout( 2, 2) );
		panel[19].setLayout( new BorderLayout( 2, 2) );
		panel[21].setLayout( new BorderLayout( 2, 2) );
		panel[22].setLayout( new BorderLayout( 2, 2) );
		panel[24].setLayout( new BorderLayout( 2, 2) );
		panel[26].setLayout( new BorderLayout( 2, 2) );
		panel[29].setLayout( new BorderLayout( 2, 2) );
		panel[31].setLayout( new BorderLayout( 2, 2) );
		panel[33].setLayout( new BorderLayout( 2, 2) );
		panel[35].setLayout( new BorderLayout( 2, 2) );
		panel[38].setLayout( new BorderLayout( 2, 2) );
		panel[39].setLayout( new BorderLayout( 2, 2) );
		panel[41].setLayout( new BorderLayout( 2, 2) );
		panel[44].setLayout( new BorderLayout( 2, 2) );
		panel[47].setLayout( new BorderLayout( 2, 2) );
		panel[49].setLayout( new BorderLayout( 2, 2) );
		panel[51].setLayout( new BorderLayout( 2, 2) );
	 	
		panel[ 5].setLayout( new GridLayout( 2, 1, 2, 2) );
		panel[ 7].setLayout( new GridLayout( 2, 4, 2, 2) );
		panel[ 9].setLayout( new GridLayout( 2, 8, 2, 2) );
		
		panel[23].setLayout( new GridLayout( 3, 2, 1, 1) );
		jToolBar.setLayout( new GridLayout( 3, 2, 0, 0) );
		jToolBar.setFloatable(false);
		panel[40].setLayout( new GridLayout( 5, 3, 1, 1) );
	}		
	public void setpanelcolor(){
		panel[0].setBackground(new Color(176,176,176));
		panel[1].setBackground(new Color(176,176,176));
		panel[2].setBackground(new Color(176,176,176));
		panel[3].setBackground(new Color(176,176,176));
		panel[4].setBackground(new Color(176,176,176));
		panel[6].setBackground(new Color(176,176,176));
		panel[8].setBackground(new Color(176,176,176));
		panel[10].setBackground(new Color(176,176,176));
		panel[13].setBackground(new Color(176,176,176));
		panel[15].setBackground(new Color(176,176,176));
		panel[17].setBackground(new Color(176,176,176));
		panel[19].setBackground(new Color(176,176,176));
		panel[22].setBackground(new Color(176,176,176));
		panel[24].setBackground(new Color(176,176,176));
		panel[29].setBackground(new Color(176,176,176));
		panel[31].setBackground(new Color(176,176,176));
		panel[33].setBackground(new Color(176,176,176));
		panel[35].setBackground(new Color(176,176,176));
		panel[38].setBackground(new Color(176,176,176));
		panel[39].setBackground(new Color(176,176,176));
		panel[44].setBackground(new Color(176,176,176));
		panel[47].setBackground(new Color(176,176,176));
		panel[49].setBackground(new Color(176,176,176));
		panel[51].setBackground(new Color(176,176,176));
		
		panel[5].setBackground(new Color(215,215,215));
		panel[7].setBackground(new Color(215,215,215));
		panel[9].setBackground(new Color(215,215,215));
		panel[11].setBackground(new Color(215,215,215));
		panel[12].setBackground(new Color(215,215,215));
		panel[14].setBackground(new Color(215,215,215));
		panel[16].setBackground(new Color(215,215,215));
		panel[18].setBackground(new Color(215,215,215));
		panel[20].setBackground(new Color(215,215,215));
		panel[21].setBackground(new Color(215,215,215));
		panel[23].setBackground(new Color(215,215,215));
		panel[25].setBackground(new Color(215,215,215));
		panel[26].setBackground(new Color(215,215,215));
		panel[27].setBackground(new Color(215,215,215));
		panel[28].setBackground(new Color(215,215,215));
		panel[30].setBackground(new Color(215,215,215));
		panel[32].setBackground(new Color(215,215,215));
		panel[34].setBackground(new Color(215,215,215));
		panel[36].setBackground(new Color(215,215,215));
		panel[37].setBackground(new Color(215,215,215));
		panel[39].setBackground(new Color(215,215,215));
		panel[40].setBackground(new Color(215,215,215));
		panel[41].setBackground(new Color(215,215,215));
		panel[42].setBackground(new Color(215,215,215));
		panel[43].setBackground(new Color(215,215,215));
		panel[45].setBackground(new Color(215,215,215));
		panel[46].setBackground(new Color(215,215,215));
		panel[48].setBackground(new Color(215,215,215));
		panel[50].setBackground(new Color(215,215,215));
		panel[52].setBackground(new Color(215,215,215));
		panel[53].setBackground(new Color(215,215,215));
	}
	public void Add(){
		for(int i=0; i<colorbutton.length;i++){ panel[9].add(colorbutton[i]); }
		panel[7].add(leftcolortextfield);
		panel[7].add(blanklabel[0]);
		panel[7].add(rightcolortextfield);
		panel[7].add(blanklabel[1]);
		panel[5].add(leftcolorlabel);
		panel[5].add(rightcolorlabel);
		panel[10].add(panel[11],BorderLayout.WEST);
		panel[10].add(panel[12],BorderLayout.CENTER);
		panel[8].add(panel[9],BorderLayout.WEST);
		panel[8].add(panel[10],BorderLayout.CENTER);
		panel[6].add(panel[7],BorderLayout.WEST);
		panel[6].add(panel[8],BorderLayout.CENTER);
		panel[4].add(panel[5],BorderLayout.WEST);
		panel[4].add(panel[6],BorderLayout.CENTER);
		panel[16].add(areatetextfield);
		panel[21].add(statelabel);
		panel[18].add(coordtetextfield);
		panel[19].add(panel[20],BorderLayout.EAST);
		panel[19].add(panel[21],BorderLayout.CENTER);
		panel[17].add(panel[18],BorderLayout.EAST);
		panel[17].add(panel[19],BorderLayout.CENTER);
		panel[15].add(panel[16],BorderLayout.EAST);
		panel[15].add(panel[17],BorderLayout.CENTER);
		panel[13].add(panel[14],BorderLayout.EAST);
		panel[13].add(panel[15],BorderLayout.CENTER);
		panel[3].add(panel[4],BorderLayout.CENTER);
		panel[3].add(panel[13],BorderLayout.SOUTH);
		panel[25].add(toollabel);
		panel[25].add(tooltextfield);
		
		for(int i=0;i<6;i++){ 
			jToolBar.add(toolbutton[i]);
			toolbutton[i].setFocusable( false );
			buttonGroup.add(toolbutton[i]);
		}
		
		panel[26].add(panel[27],BorderLayout.NORTH);
		panel[24].add(panel[25],BorderLayout.NORTH);
		panel[24].add(panel[26],BorderLayout.CENTER);
		panel[22].add(jToolBar,BorderLayout.NORTH);
		panel[22].add(panel[24],BorderLayout.CENTER);
		panel[2].add(panel[3],BorderLayout.SOUTH);
		panel[2].add(tabbedPane,BorderLayout.CENTER);
		panel[2].add(panel[22],BorderLayout.WEST);
		panel[30].add(filllabel[0]);
		panel[32].add(filltextfield[0]);
		panel[34].add(filllabel[1]);
		panel[36].add(filltextfield[1]);
		panel[37].add(backbutton);
		panel[37].add(nextbutton);
		panel[44].add(panel[37],BorderLayout.WEST);
		panel[44].add(panel[45],BorderLayout.CENTER);
		panel[35].add(panel[36],BorderLayout.WEST);
		panel[35].add(panel[44],BorderLayout.CENTER);
		panel[33].add(panel[34],BorderLayout.WEST);
		panel[33].add(panel[35],BorderLayout.CENTER);
		panel[31].add(panel[32],BorderLayout.WEST);
		panel[31].add(panel[33],BorderLayout.CENTER);
		panel[29].add(panel[30],BorderLayout.WEST);
		panel[29].add(panel[31],BorderLayout.CENTER);
		
		for(int i=6;i<toolbutton.length;i++){ panel[40].add(toolbutton[i]); }
		
		
		panel[41].add(panel[42],BorderLayout.NORTH);
		panel[41].add(panel[43],BorderLayout.CENTER);
		panel[38].add(panel[40],BorderLayout.NORTH);
		panel[38].add(panel[41],BorderLayout.CENTER);
		panel[46].add(fragmenttextfield);
		panel[48].add(fragmentlinebiglabel);
		panel[48].add(fragmentlinebig);
		panel[50].add(fragmentbackbutton);
		panel[50].add(fragmentnextbutton);
		panel[51].add(panel[52],BorderLayout.NORTH);
		panel[51].add(panel[53],BorderLayout.CENTER);
		panel[49].add(panel[50],BorderLayout.NORTH);
		panel[49].add(panel[51],BorderLayout.CENTER);
		panel[47].add(panel[48],BorderLayout.NORTH);
		panel[47].add(panel[49],BorderLayout.CENTER);
		panel[39].add(panel[46],BorderLayout.NORTH);
		panel[39].add(panel[47],BorderLayout.CENTER);
		tabbedPane2.addTab( "�h���", new ImageIcon( getClass().getResource(String.format("202.gif")) ), panel[38], "�h��ο��"  ); 
	  	tabbedPane2.addTab( "�H�ι�", new ImageIcon( getClass().getResource(String.format("203.gif")) ), panel[39], "�H�ιϿ��"  );
		panel[1].add(tabbedPane2);
		panel[0].add(panel[29],BorderLayout.NORTH);
		panel[0].add(panel[2],BorderLayout.CENTER);
		panel[0].add(panel[1],BorderLayout.EAST);
		
		for(int i=0;i<item0.length;i++){
		    menu[0].add( item0[i] ); 
		    if(i==3){
		    	menu[0].addSeparator();
		    }
		}
	  	for(int i = 0 ; i < item1.length   ; i++ ){ menu[ 1].add( item1[i]   ); }
	  	for(int i = 0 ; i < item2.length   ; i++ ){ menu[ 2].add( item2[i]   ); }
	  	for(int i = 0 ; i < item3.length   ; i++ ){ menu[ 3].add( item3[i]   ); }
	  	for(int i = 0 ; i < item4.length   ; i++ ){ menu[ 4].add( item4[i]   ); }
	  	for(int i = 0 ; i < item5.length   ; i++ ){ menu[ 5].add( item5[i]   ); }
	  	for(int i = 0 ; i < item6_1.length ; i++ ){ item6[0].add( item6_1[i] ); }
	  	for(int i = 0 ; i < item6_2.length ; i++ ){ item6[1].add( item6_2[i] ); }
	  	for(int i = 0 ; i < item6.length   ; i++ ){ menu[ 6].add( item6[i]   ); }
	  	for(int i = 0 ; i < item7.length   ; i++ ){ menu[ 7].add( item7[i]   ); }
	  	for(int i = 0 ; i < menu.length    ; i++ ){ bar.add     ( menu[ i]    ); }
	  	
	  	Bpanel[newpanel].setBackground(new Color(255,255,255));
		tabbedPane.addTab( "���R�W"+(newpanel+1), new ImageIcon( getClass().getResource(String.format("201.gif")) ), Bpanel[newpanel], "���R�W"+(newpanel+1)  ); 
	}
	public void handler(){
		MouseClickcolorbuttonHandler colorbuttonhandler = new MouseClickcolorbuttonHandler();
		for(int i=0;i<colorbutton.length;i++){ colorbutton[i].addMouseListener( colorbuttonhandler ); }
		
		MouseClickfilltextfieldHandler filltextfieldhandler = new MouseClickfilltextfieldHandler();
		for(int i=0;i<filltextfield.length;i++){ filltextfield[i].addMouseListener( filltextfieldhandler ); }
		
		toolbuttonHandler toolbuttonhandler = new toolbuttonHandler();
		for(int i=0;i<toolbutton.length;i++){ toolbutton[i].addActionListener( toolbuttonhandler ); }
		
		MouseClicktoolbuttonHandler mousetoolbuttonhandler = new MouseClicktoolbuttonHandler();
		for(int i=0;i<toolbutton.length;i++){ toolbutton[i].addMouseListener( mousetoolbuttonhandler ); }
		backbutton.addMouseListener( mousetoolbuttonhandler );
		nextbutton.addMouseListener( mousetoolbuttonhandler );
		fragmentbackbutton.addMouseListener( mousetoolbuttonhandler );
		fragmentnextbutton.addMouseListener( mousetoolbuttonhandler );

		Panel27buttonHandler panel27buttonHandler = new Panel27buttonHandler();
		for(int i=0;i<erasersizebutton.length    ;i++){ erasersizebutton[i].addActionListener   ( panel27buttonHandler ); }
		for(int i=0;i<spraysizebutton.length     ;i++){ spraysizebutton[i].addActionListener    ( panel27buttonHandler ); }
		for(int i=0;i<brushsizebutton.length     ;i++){ brushsizebutton[i].addActionListener    ( panel27buttonHandler ); }
		for(int i=0;i<linesizebutton.length      ;i++){ linesizebutton[i].addActionListener     ( panel27buttonHandler ); }
		for(int i=0;i<arrowheadsizebutton.length ;i++){ arrowheadsizebutton[i].addActionListener( panel27buttonHandler ); }
		for(int i=0;i<rectsizebutton.length      ;i++){ rectsizebutton[i].addActionListener     ( panel27buttonHandler ); }
		for(int i=0;i<ovalsizebutton.length      ;i++){ ovalsizebutton[i].addActionListener     ( panel27buttonHandler ); }
		for(int i=0;i<roundrectsizebutton.length ;i++){ roundrectsizebutton[i].addActionListener( panel27buttonHandler ); }
		for(int i=0;i<circlesizebutton.length    ;i++){ circlesizebutton[i].addActionListener   ( panel27buttonHandler ); }
		for(int i=0;i<squaresizebutton.length;i++){ squaresizebutton[i].addActionListener       ( panel27buttonHandler ); }
		for(int i=0;i<parallelogramsizebutton.length         ;i++){ parallelogramsizebutton[i].addActionListener        ( panel27buttonHandler ); }
		for(int i=0;i<trapezoidsizebutton.length             ;i++){ trapezoidsizebutton[i].addActionListener            ( panel27buttonHandler ); }
		for(int i=0;i<rhombussizebutton.length               ;i++){ rhombussizebutton[i].addActionListener              ( panel27buttonHandler ); }
		for(int i=0;i<octanglesizebutton.length              ;i++){ octanglesizebutton[i].addActionListener             ( panel27buttonHandler ); }
		for(int i=0;i<right_angled_trianglesizebutton.length ;i++){ right_angled_trianglesizebutton[i].addActionListener( panel27buttonHandler ); }
		for(int i=0;i<hexagonsizebutton.length               ;i++){ hexagonsizebutton[i].addActionListener              ( panel27buttonHandler ); }
		for(int i=0;i<crosssizebutton.length                 ;i++){ crosssizebutton[i].addActionListener                ( panel27buttonHandler ); }
		for(int i=0;i<pentagonsizebutton.length              ;i++){ pentagonsizebutton[i].addActionListener             ( panel27buttonHandler ); }
		for(int i=0;i<trianglesizebutton.length              ;i++){ trianglesizebutton[i].addActionListener             ( panel27buttonHandler ); }
		for(int i=0;i<cylinder.length              ;i++){ cylinder[i].addActionListener             ( panel27buttonHandler ); }
		
		MenuHandler Menuhandler = new MenuHandler();
		for(int i=0;i<item0.length       ;i++){ item0[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item1.length       ;i++){ item1[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item2.length       ;i++){ item2[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item3.length       ;i++){ item3[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item4.length       ;i++){ item4[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item5.length       ;i++){ item5[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item6_1.length       ;i++){ item6_1[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item6_2.length       ;i++){ item6_2[i].addActionListener       ( Menuhandler ); }
	  	for(int i=0;i<item7.length       ;i++){ item7[i].addActionListener       ( Menuhandler ); }
	  	
	  	BackNextHandler backnexthandler = new BackNextHandler();
	  	backbutton.addActionListener(backnexthandler);
	  	nextbutton.addActionListener(backnexthandler);
	  	
	  	FragmentHandler fragmentHandler = new FragmentHandler();
	  	fragmentbackbutton.addActionListener(fragmentHandler);
	  	fragmentnextbutton.addActionListener(fragmentHandler);
	  	fragmentlinebig.addChangeListener(fragmentHandler);
	  	tabbedPane2.addChangeListener(fragmentHandler);
	}
	private class FragmentHandler implements ActionListener,ChangeListener {
		public void actionPerformed( ActionEvent event ){
			
			if(event.getSource()==fragmentnextbutton ){
				 if(ck==1){
					 Bpanel[0].sett(-1);
					 fragmentbig = Integer.parseInt(fragmentlinebig.getValue().toString());
					 level++;
					 fragment = new MyFragment(level,Bpanel[0].getx1(),Bpanel[0].gety1(),Bpanel[0].getx2(),Bpanel[0].gety2(),fragmentbig,Bpanel[0].getleftcolor());
					 fragmenttextfield.setText(String.format("��%d�h",level+1));
				 }
				 else{
					 JOptionPane.showMessageDialog( MyFrame.this,"�Х��ԥX�@���u!!","ĵ�i", JOptionPane.INFORMATION_MESSAGE );
				 }
				  repaint();
			}
			if(event.getSource()==fragmentbackbutton){
				 if(ck==1){
					level--;
					if(level<-1){
						JOptionPane.showMessageDialog( MyFrame.this,"�S���W�@�B!!","ĵ�i", JOptionPane.ERROR_MESSAGE );
						Bpanel[0].setlineclear();
						ck=0;
						level=0;
						Bpanel[0].sett(21);
					}
					else{
						fragment = new MyFragment(level,Bpanel[0].getx1(),Bpanel[0].gety1(),Bpanel[0].getx2(),Bpanel[0].gety2(),fragmentbig,Bpanel[0].getleftcolor());
						fragmenttextfield.setText(String.format("��%d�h",level+1));
					}
				 }
				 else{
					 JOptionPane.showMessageDialog( MyFrame.this,"�Х��ԥX�@���u!!","ĵ�i", JOptionPane.INFORMATION_MESSAGE );
				 }
				repaint();
			}
		}
		public void stateChanged(ChangeEvent e) {
			if(e.getSource()==fragmentlinebig){
				fragmentbig = Integer.parseInt(fragmentlinebig.getValue().toString());
				if(fragmentbig <= 0) {
					fragmentlinebig.setValue(new Integer(1));
					fragmentbig = 1;
				}
				repaint();
			}
			if(e.getSource()==tabbedPane2){
				Bpanel[0].sett(21);
				if(ch==0){
					JOptionPane.showMessageDialog( MyFrame.this,"�Х��ԥX�@���u!!","ĵ�i", JOptionPane.INFORMATION_MESSAGE );
					fragmentbig = Integer.parseInt(fragmentlinebig.getValue().toString());
					fragmenttextfield.setText(String.format("��%d�h",1));
					ch++;
				}
				else{ 
					ch=0; 
					ck=0;
					level=0;
					Bpanel[0].setlineclear();
					Bpanel[0].sett(2);
				}
			}
			repaint();
		}
	}
	private class BackNextHandler implements ActionListener {
		public void actionPerformed( ActionEvent event ){
			if(event.getSource()==backbutton){
				Bpanel[0].setback();
			}
			if(event.getSource()==nextbutton ){
				Bpanel[0].setnext();
			}
		}
	}
	private class MouseClickfilltextfieldHandler  extends MouseAdapter {
		public void mouseClicked( MouseEvent event ){
			Color c;
			if ( event.getSource() == filltextfield[0] ){
				c=JColorChooser.showDialog(null, "����C��",leftcolortextfield.getBackground());
				for(int j=0;j<Bpanel.length;j++){
					if(c==null){
						c=Bpanel[j].getleftcolor();
					}
					Bpanel[j].setleftcolor(c);
				}
				leftcolortextfield.setBackground(c);
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
			}
			else if( event.getSource() == filltextfield[1] ){
				c=JColorChooser.showDialog(null, "����C��",rightcolortextfield.getBackground());
				
				for(int j=0;j<Bpanel.length;j++){
					if(c==null){
						c=Bpanel[j].getrightcolor();
					}
					Bpanel[j].setrightcolor(c);
				}
				rightcolortextfield.setBackground(c);
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
			}
		}	
	}
	private class MouseClicktoolbuttonHandler implements MouseListener{
		public void mouseClicked( MouseEvent e ){
		}
		public void mouseEntered(MouseEvent e) {
			if(e.getSource()==backbutton && Bpanel[0].geti()>-1 && (Bpanel[0].geti()>b)){
				backbutton.removeAll();
				
				backbutton.setIcon(new ImageIcon( getClass().getResource(String.format("190.gif")) ));
				backbutton.setBackground(new Color(240,240,240));
				
			}
			if(e.getSource()==nextbutton && Bpanel[0].geti()>-1 && (b>-1)){
				nextbutton.removeAll();
				nextbutton.setIcon(new ImageIcon( getClass().getResource(String.format("191.gif")) ));
				nextbutton.setBackground(new Color(240,240,240));
			}
			for(int i=0 ; i < toolbutton.length ; i++){
				if(e.getSource()==toolbutton[i]){
					if(t==i){
						toolbutton[i].setBackground(new Color(160,160,160));
					}
					else{
						toolbutton[i].setBackground(new Color(240,240,240));
					}
				}
			}
			if(e.getSource()==fragmentbackbutton){
				fragmentbackbutton.setBackground(new Color(240,240,240));
			}
			if(e.getSource()==fragmentnextbutton){
				fragmentnextbutton.setBackground(new Color(240,240,240));
			}
		}
		public void mouseExited(MouseEvent e) {
			if(e.getSource()==backbutton){
				backbutton.setIcon(new ImageIcon( getClass().getResource(String.format("192.gif")) ));
				backbutton.setBackground(new Color(215,215,215));
			}
			if(e.getSource()==nextbutton){
				nextbutton.setIcon(new ImageIcon( getClass().getResource(String.format("193.gif")) ));
				nextbutton.setBackground(new Color(215,215,215));
			}
			for(int i=0 ; i < toolbutton.length ; i++){
				if(i==t){
					toolbutton[i].setBackground(new Color(160,160,160));
				}
				else{
					toolbutton[i].setBackground(new Color(215,215,215));
				}
			}
			if(e.getSource()==fragmentbackbutton){
				fragmentbackbutton.setBackground(new Color(215,215,215));
			}
			if(e.getSource()==fragmentnextbutton){
				fragmentnextbutton.setBackground(new Color(215,215,215));
			}
		}
		public void mousePressed(MouseEvent e) {
			for(int i=0 ; i < toolbutton.length ; i++){
				if(e.getSource()==toolbutton[i]){
					if(t==i){
						toolbutton[t].setBackground(new Color(160,160,160));
					}
					else{
						toolbutton[t].setBackground(new Color(215,215,215));
					}
				}
			}
		}
		public void mouseReleased(MouseEvent e) { }
	}
	private class MouseClickcolorbuttonHandler  extends MouseAdapter {
		public void mouseClicked( MouseEvent event ){
			if ( event.isMetaDown() ){
				if(event.getClickCount()==2){
					colors[16]=JColorChooser.showDialog(null, "����C��",rightcolortextfield.getBackground());
					for(int j=0;j<Bpanel.length;j++){
						if(colors[16]==null){
							colors[16]=Bpanel[j].getrightcolor();
						}
						Bpanel[j].setrightcolor(colors[16]);
					}
					rightcolortextfield.setBackground(colors[16]);
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
				else{
					for(int i=0;i<colorbutton.length;i++){
						if ( event.getSource() == colorbutton[i] ){
							
								for(int j=0;j<Bpanel.length;j++){
									Bpanel[j].setrightcolor(colors[i]);
								}
								rightcolortextfield.setBackground(colors[i]);
								filltextfield[1].setBackground(rightcolortextfield.getBackground());
						}
					}	
				}
			}
			else if (event.isAltDown()){ }
			else{
				if(event.getClickCount()==2){
					colors[16]=JColorChooser.showDialog(null, "����C��",leftcolortextfield.getBackground());
					for(int j=0;j<Bpanel.length;j++){
						if(colors[16]==null){
							colors[16]=Bpanel[j].getleftcolor();
						}
						Bpanel[j].setleftcolor(colors[16]);
					}
					leftcolortextfield.setBackground(colors[16]);
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
				}
				else{
					for(int i=0;i<colorbutton.length;i++){
						if ( event.getSource() == colorbutton[i] ){
								for(int j=0;j<Bpanel.length;j++){
									Bpanel[j].setleftcolor(colors[i]);
								}
								leftcolortextfield.setBackground(colors[i]);
								filltextfield[0].setBackground(leftcolortextfield.getBackground());
						}
					}
				}
			}
		}
	}
	private class toolbuttonHandler implements ActionListener {
		public void actionPerformed( ActionEvent event ){
			if ( event.getSource() == toolbutton[0] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(true);
				panel[27].setLayout( new GridLayout( 4, 1,1,1) );
				for(int i=0;i<erasersizebutton.length;i++){
					panel[27].add(erasersizebutton[i]);
					erasersizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=0;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
				}
				filllabel[0].setText("�����(1)                     ");
				filltextfield[0].setBackground(rightcolortextfield.getBackground());
				filltextfield[1].setBackground(leftcolortextfield.getBackground());
				erasersizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�����(1)");
				statelabel.setText("��ܤF������C");
			}
			if ( event.getSource() == toolbutton[1] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(true);
				panel[27].setLayout( new GridLayout( 4, 1,1,1) );
				for(int i=0;i<spraysizebutton.length;i++){
					panel[27].add(spraysizebutton[i]);
					spraysizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=1;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(2); 
				}
				filllabel[0].setText("�Q��(2)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				spraysizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�Q��(2)");
				statelabel.setText("�A��ܤF�Q���C");
			}
			if ( event.getSource() == toolbutton[2] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(false);
				validate();
				t=2;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
				}
				filllabel[0].setText("���C                              ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				tooltextfield.setText("��");
				statelabel.setText("��ܤF���C");
			}
			if ( event.getSource() == toolbutton[3] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(true);
				panel[27].setLayout( new GridLayout( 4, 1,1,1) );
				for(int i=0;i<brushsizebutton.length;i++){
					panel[27].add(brushsizebutton[i]);
					brushsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=3;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(2); 
				}
				filllabel[0].setText("��l(2)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				brushsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("��l(2)");
				statelabel.setText("�A��ܤF��l�C");
			}
			if ( event.getSource() == toolbutton[4] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(true);
				panel[27].setLayout( new GridLayout( 5, 1,1,1) );
				for(int i=0;i<linesizebutton.length;i++){
					panel[27].add(linesizebutton[i]);
					linesizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=4;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
				}
				filllabel[0].setText("���u(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				linesizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("���u(1)");
				statelabel.setText("��ܤF���u�C");
			}
			if ( event.getSource() == toolbutton[5] ){
				panel[27].removeAll();panel[42].removeAll();
				panel[27].setVisible(true);
				panel[27].setLayout( new GridLayout( 6, 1,1,1) );
				for(int i=0;i<arrowheadsizebutton.length;i++){
					panel[27].add(arrowheadsizebutton[i]);
					arrowheadsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=5;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
				}
				filllabel[0].setText("�b�Y(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				arrowheadsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�b�Y(1)");
				statelabel.setText("��ܤF�b�Y�C");
			}
			if ( event.getSource() == toolbutton[6] ){
				panel[42].removeAll();panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 4, 1,1,1) );
				for(int i=0;i<rectsizebutton.length;i++){
					panel[42].add(rectsizebutton[i]);
					rectsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=6;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�x��(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				rectsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�x��(1)");
				statelabel.setText("�A��ܤF�e�x�ΡC");
			}
			if ( event.getSource() == toolbutton[7] ){
				panel[42].removeAll();panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 5, 1,1,1) );
				for(int i=0;i<ovalsizebutton.length;i++){
					panel[42].add(ovalsizebutton[i]);
					ovalsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=7;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("����(1)                     ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				ovalsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("����(1)");
				statelabel.setText("�A��ܤF�e���ΡC");
			}
			if ( event.getSource() == toolbutton[8] ){
				panel[42].removeAll();panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 6, 1,1,1) );
				for(int i=0;i<roundrectsizebutton.length;i++){
					panel[42].add(roundrectsizebutton[i]);
					roundrectsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=8;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�ꨤ�x��(1)                 ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				roundrectsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�ꨤ�x��(1)");
				statelabel.setText("�A��ܤF�ꨤ�x�ΡC");
			}
			if ( event.getSource() == toolbutton[9] ){
				panel[42].removeAll();panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 6, 1,1,1) );
				for(int i=0;i<circlesizebutton.length;i++){
					panel[42].add(circlesizebutton[i]);
					circlesizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=9;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("���(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				circlesizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("���(1)");
				statelabel.setText("�A��ܤF��ΡC");
			}
			if ( event.getSource() == toolbutton[10] ){
				panel[42].removeAll();panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 6, 1,1,1) );
				for(int i=0;i<squaresizebutton.length;i++){
					panel[42].add(squaresizebutton[i]);
					squaresizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=10;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�����(1)                     ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				squaresizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�����(1)");
				statelabel.setText("�A��ܤF����ΡC");
			}
			if ( event.getSource() == toolbutton[11] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 6, 1,1,1) );
				for(int i=0;i<parallelogramsizebutton.length;i++){
					panel[42].add(parallelogramsizebutton[i]);
					parallelogramsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=11;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("����|���(1)            ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				parallelogramsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("����|���(1)");
				statelabel.setText("�A��ܤF����|��C");
			}
			if ( event.getSource() == toolbutton[12] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 7, 1,1,1) );
				for(int i=0;i<trapezoidsizebutton.length;i++){
					panel[42].add(trapezoidsizebutton[i]);
					trapezoidsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=12;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("���(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				trapezoidsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("���(1)");
				statelabel.setText("�A��ܤF��ΡC");
			}
			if ( event.getSource() == toolbutton[13] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 8, 1,1,1) );
				for(int i=0;i<rhombussizebutton.length;i++){
					panel[42].add(rhombussizebutton[i]);
					rhombussizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=13;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�٧�(1)                         ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				rhombussizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�٧�(1)");
				statelabel.setText("�A��ܤF�٧ΡC");
			}
			if ( event.getSource() == toolbutton[14] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 9, 1,1,1) );
				for(int i=0;i<octanglesizebutton.length;i++){
					panel[42].add(octanglesizebutton[i]);
					octanglesizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=14;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�K����(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				octanglesizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�K����(1)");
				statelabel.setText("�A��ܤF�K���ΡC");
			}
			if ( event.getSource() == toolbutton[15] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 10, 1,1,1) );
				for(int i=0;i<right_angled_trianglesizebutton.length;i++){
					panel[42].add(right_angled_trianglesizebutton[i]);
					right_angled_trianglesizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=15;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�����T����(1)            ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				right_angled_trianglesizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�����T����(1)");
				statelabel.setText("�A��ܤF�����T���ΡC");
			}
			if ( event.getSource() == toolbutton[16] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 11, 1,1,1) );
				for(int i=0;i<hexagonsizebutton.length;i++){
					panel[42].add(hexagonsizebutton[i]);
					hexagonsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=16;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("������(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				hexagonsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("������(1)");
				statelabel.setText("�A��ܤF�����ΡC");
			}
			if ( event.getSource() == toolbutton[17] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 12, 1,1,1) );
				for(int i=0;i<crosssizebutton.length;i++){
					panel[42].add(crosssizebutton[i]);
					crosssizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=17;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�Q�r��(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				crosssizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�Q�r��(1)");
				statelabel.setText("�A��ܤF�Q�r�ΡC");
			}
			if ( event.getSource() == toolbutton[18] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 13, 1,1,1) );
				for(int i=0;i<pentagonsizebutton.length;i++){
					panel[42].add(pentagonsizebutton[i]);
					pentagonsizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=18;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("������(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				pentagonsizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("������(1)");
				statelabel.setText("�A��ܤF�����ΡC");
			}
			if ( event.getSource() == toolbutton[19] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 14, 1,1,1) );
				for(int i=0;i<trianglesizebutton.length;i++){
					panel[42].add(trianglesizebutton[i]);
					trianglesizebutton[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=19;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("�T����(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				trianglesizebutton[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("�T����(1)");
				statelabel.setText("�A��ܤF�T���ΡC");
			}
			if ( event.getSource() == toolbutton[20] ){
				panel[42].removeAll();
				panel[27].removeAll();
				panel[42].setVisible(true);
				panel[42].setLayout( new GridLayout( 15, 1,1,1) );
				for(int i=0;i<cylinder.length;i++){
					panel[42].add(cylinder[i]);
					cylinder[i].setBackground(new Color(200,200,200));
				}
				validate();
				t=20;
				for(int j=0;j<Bpanel.length;j++){
					Bpanel[j].sett(t);
					Bpanel[j].setbig(1); 
					Bpanel[j].setFilled(false); 
				}
				filllabel[0].setText("��W��(1)                      ");
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
				filltextfield[1].setBackground(rightcolortextfield.getBackground());
				cylinder[0].setBackground(new Color(160,160,160));
				tooltextfield.setText("��W��(1)");
				statelabel.setText("�A��ܤF��W�ΡC");
			}
		}
	}
	private class Panel27buttonHandler implements ActionListener {
		public void actionPerformed( ActionEvent event ){
			for(int i=0;i<erasersizebutton.length;i++){
				erasersizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == erasersizebutton[i] ){
					erasersizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setbig((i*2)+1); 
					}
					filllabel[0].setText(String.format( "�����(%d)                     ",(i*2)+1));
					filltextfield[0].setBackground(rightcolortextfield.getBackground());
					filltextfield[1].setBackground(leftcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�����(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ��������C",(i*2)+1));
				}
			}
			for(int i=0;i<brushsizebutton.length;i++){
				brushsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == brushsizebutton[i] ){
					brushsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setbig((i+1)*2);
					}
					filllabel[0].setText(String.format( "��l(%d)                         ",(i+1)*2));
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "��l(%d)",(i+1)*2));
					statelabel.setText(String.format( "�A��ܤF�e%d ����l�C",(i+1)*2));
				}
			}
			for(int i=0;i<linesizebutton.length;i++){
				linesizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == linesizebutton[i] ){
					linesizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setbig((i*2)+1); 
					}
					filllabel[0].setText(String.format( "���u(%d)                         ",(i*2)+1));
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "���u(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d �����u�C",(i*2)+1));
				}
			}
			for(int i=0;i<arrowheadsizebutton.length;i++){
				arrowheadsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == arrowheadsizebutton[i] ){
					arrowheadsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setbig((i*2)+1); 
					}
					filllabel[0].setText(String.format( "�b�Y(%d)                         ",(i*2)+1));
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�b�Y(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ���b�Y�C",(i*2)+1));
				}
			}
			for(int i=0;i<spraysizebutton.length;i++){
				spraysizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == spraysizebutton[i] ){
					spraysizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setbig((i+1)*2);
					}
					filllabel[0].setText(String.format( "�Q��(%d)                         ",(i+1)*2));
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�Q��(%d)",(i+1)*2));
					statelabel.setText(String.format( "�A��ܤF�e%d ���Q���C",(i+1)*2));
				}
			}
			for(int i=0;i<rectsizebutton.length;i++){
				rectsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == rectsizebutton[i] ){
					rectsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						if(i<=2){
							Bpanel[j].setFilled(false); 
							filllabel[0].setText(String.format( "�x��(%d)                         ",(i*2)+1));
						}
						else{
							Bpanel[j].setFilled(true); 
							filllabel[0].setText("�ЦA�k���C���l���I���C��H��R��m�C");
						}
						Bpanel[j].setbig((i*2)+1); 
					}
					if(i<=2){
						tooltextfield.setText(String.format( "�x��(%d)",(i*2)+1));
						statelabel.setText(String.format( "�A��ܤF�e%d ���x�ΡC",(i*2)+1));
					}
					else{
						tooltextfield.setText(String.format( "�x��(��R)"));
						statelabel.setText(String.format( "�A��ܤF��R���x�ΡC"));
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
			}
			for(int i=0;i<ovalsizebutton.length;i++){
				ovalsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == ovalsizebutton[i] ){
					ovalsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						if(i<=2){
							Bpanel[j].setFilled(false); 
							filllabel[0].setText(String.format( "����(%d)                     ",(i*2)+1));
						}
						else{
							Bpanel[j].setFilled(true); 
							filllabel[0].setText("�ЦA�k���C���l���I���C��H��R��m�C");
						}
						Bpanel[j].setbig((i*2)+1); 
					}
					if(i<=2){
						tooltextfield.setText(String.format( "����(%d)",(i*2)+1));
						statelabel.setText(String.format( "�A��ܤF�e%d �����ΡC",(i*2)+1));
					}
					else{
						tooltextfield.setText(String.format( "����(��R)"));
						statelabel.setText(String.format( "�A��ܤF��R�����ΡC"));
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
			}
			for(int i=0;i<roundrectsizebutton.length;i++){
				roundrectsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == roundrectsizebutton[i] ){
					roundrectsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						if(i<=2){
							Bpanel[j].setFilled(false); 
							filllabel[0].setText(String.format( "�ꨤ�x��(%d)                 ",(i*2)+1));
						}
						else{
							Bpanel[j].setFilled(true); 
							filllabel[0].setText("�ЦA�k���C���l���I���C��H��R��m�C");
						}
						Bpanel[j].setbig((i*2)+1); 
					}
					if(i<=2){
						tooltextfield.setText(String.format( "�ꨤ�x��(%d)",(i*2)+1));
						statelabel.setText(String.format( "�A��ܤF�e%d ���ꨤ�x�ΡC",(i*2)+1));
					}
					else{
						tooltextfield.setText(String.format( "�ꨤ�x��(��R)"));
						statelabel.setText(String.format( "�A��ܤF��R���ꨤ�x�ΡC"));
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
			}
			for(int i=0;i<circlesizebutton.length;i++){
				circlesizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == circlesizebutton[i] ){
					circlesizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						if(i<=2){
							Bpanel[j].setFilled(false); 
							filllabel[0].setText(String.format( "���(%d)                         ",(i*2)+1));
						}
						else{
							Bpanel[j].setFilled(true); 
							filllabel[0].setText("�ЦA�k���C���l���I���C��H��R��m�C");
						}
						Bpanel[j].setbig((i*2)+1); 
					}
					if(i<=2){
						tooltextfield.setText(String.format( "���(%d)",(i*2)+1));
						statelabel.setText(String.format( "�A��ܤF�e%d ����ΡC",(i*2)+1));
					}
					else{
						tooltextfield.setText(String.format( "���(��R)"));
						statelabel.setText(String.format( "�A��ܤF��R����ΡC"));
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
			}
			for(int i=0;i<squaresizebutton.length;i++){
				squaresizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == squaresizebutton[i] ){
					squaresizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						if(i<=2){
							Bpanel[j].setFilled(false); 
							filllabel[0].setText(String.format( "�����(%d)                     ",(i*2)+1));
						}
						else{
							Bpanel[j].setFilled(true); 
							filllabel[0].setText("�ЦA�k���C���l���I���C��H��R��m�C");
						}
						Bpanel[j].setbig((i*2)+1); 
					}
					if(i<=2){
						tooltextfield.setText(String.format( "�����(%d)",(i*2)+1));
						statelabel.setText(String.format( "�A��ܤF�e%d �����ΡC",(i*2)+1));
					}
					else{
						tooltextfield.setText(String.format( "�����(��R)"));
						statelabel.setText(String.format( "�A��ܤF��R������ΡC"));
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
				}
			}
			
			for(int i=0;i<parallelogramsizebutton.length;i++){
				parallelogramsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == parallelogramsizebutton[i] ){
					parallelogramsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "����|���(%d)            ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "����|���(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ������|��ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<trapezoidsizebutton.length;i++){
				trapezoidsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == trapezoidsizebutton[i] ){
					trapezoidsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "���(%d)                        ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "���(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ����ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<rhombussizebutton.length;i++){
				rhombussizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == rhombussizebutton[i] ){
					rhombussizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "�٧�(%d)                        ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�٧�(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ���٧ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<octanglesizebutton.length;i++){
				octanglesizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == octanglesizebutton[i] ){
					octanglesizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "�K����(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�K����(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ���K���ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<right_angled_trianglesizebutton.length;i++){
				right_angled_trianglesizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == right_angled_trianglesizebutton[i] ){
					right_angled_trianglesizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "�����T����(%d)            ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�����T����(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d �������T���ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<hexagonsizebutton.length;i++){
				hexagonsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == hexagonsizebutton[i] ){
					hexagonsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "���}��(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "���}��(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d �����}�ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<crosssizebutton.length;i++){
				crosssizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == crosssizebutton[i] ){
					crosssizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "�Q�r��(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�Q�r��(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ���Q�r�ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<pentagonsizebutton.length;i++){
				pentagonsizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == pentagonsizebutton[i] ){
					pentagonsizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "������(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "������(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d �������ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<trianglesizebutton.length;i++){
				trianglesizebutton[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == trianglesizebutton[i] ){
					trianglesizebutton[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "�T����(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "�T����(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ���T���ΡC",(i*2)+1));
				}
			}
			for(int i=0;i<cylinder.length;i++){
				cylinder[i].setBackground(new Color(200,200,200));
				if ( event.getSource() == cylinder[i] ){
					cylinder[i].setBackground(new Color(160,160,160));
					for(int j=0;j<Bpanel.length;j++){
						Bpanel[j].sett(t);
						Bpanel[j].setFilled(false); 
						filllabel[0].setText(String.format( "��W��(%d)                     ",(i*2)+1));
						Bpanel[j].setbig((i*2)+1); 
					}
					filltextfield[0].setBackground(leftcolortextfield.getBackground());
					filltextfield[1].setBackground(rightcolortextfield.getBackground());
					tooltextfield.setText(String.format( "��W��(%d)",(i*2)+1));
					statelabel.setText(String.format( "�A��ܤF�e%d ����W�ΡC",(i*2)+1));
				}
			}
		}
	}
	private class MenuHandler implements ActionListener {
	   	public void actionPerformed( ActionEvent event ){
	   		if(event.getSource() == item0[0]){
	   			newpanel++;
	   			Bpanel[newpanel] = new Painter();
	   			Bpanel[newpanel].setBackground(new Color(255,255,255));
				tabbedPane.addTab( "���R�W"+(newpanel+1), new ImageIcon( getClass().getResource(String.format("201.gif")) ), Bpanel[newpanel], "���R�W"+(newpanel+1) ); 
	   		}
	   		if(event.getSource() == item0[1]){
	   			int C;
				FileDialog fileDialog = new FileDialog( new Frame() , "��ܤ@�ӹ���", FileDialog.LOAD );
				fileDialog.show();
				if(fileDialog.getFile()==null) {
					JOptionPane.showMessageDialog( MyFrame.this,"�z�S���!","ĵ�i", JOptionPane.INFORMATION_MESSAGE );
				}
				if(Bpanel[0].geti()>-1){ C = JOptionPane.showConfirmDialog(null, "�x�s�ק�� ���R�W"+(newpanel+1)); }
				else{ C=1; }
				if(C==0){
					img=1;
	   				JOptionPane.showMessageDialog( MyFrame.this,"�|������","ĵ�i", JOptionPane.INFORMATION_MESSAGE );/*���s��*/
	   				Bpanel[0].setclear();
					bug = new ImageIcon( fileDialog.getDirectory()+fileDialog.getFile() );
					repaint();
	   			}
	   			if(C==1){
	   				img=1;
					Bpanel[0].setclear();
					bug = new ImageIcon( fileDialog.getDirectory()+fileDialog.getFile() );
					repaint();
	   			}
	   		}
	   		if(event.getSource() == item0[2]){
	   			FileDialog fileDialog = new FileDialog( new Frame() , "�Ы��w�@���ɦW", FileDialog.SAVE );
	   			fileDialog.show();
	   			String a ;
	   			a = fileDialog.getDirectory()+fileDialog.getFile();
	   			JOptionPane.showMessageDialog( MyFrame.this,"�|������","ĵ�i", JOptionPane.INFORMATION_MESSAGE );
	   		}
	   		if(event.getSource() == item0[3] ){ JOptionPane.showMessageDialog( MyFrame.this,"�|������","ĵ�i", JOptionPane.INFORMATION_MESSAGE ); }
	   		if(event.getSource() == item0[4] ){ System.exit( 0 );  }
	   		if(event.getSource() == item1[0] ){ Bpanel[0].setbackmenu(); }
	   		if(event.getSource() == item1[1] ){ Bpanel[0].setnextmenu(); }
	   		
	   		if(item2[0].isSelected()==false  ){ panel[22].setVisible(false); }
	   		else{ panel[22].setVisible(true); }
	   		if(item2[1].isSelected()==false  ){ panel[ 4].setVisible(false); }
			else{ panel[ 4].setVisible(true); }
	   		if(item2[2].isSelected()==false  ){ panel[13].setVisible(false); }
			else{ panel[13].setVisible(true); }
	   		if(item2[3].isSelected()==false  ){ panel[ 1].setVisible(false); }
			else{ panel[ 1].setVisible(true); }
	   		
	   		if(event.getSource() == item3[0] ){
	   			String N = JOptionPane.showInputDialog( "��J�n�M�����@�ӹϼh�C" );  
				int n = Integer.parseInt( N );
				Bpanel[n-1].setclear();
				repaint();
	   		}
	   		if(event.getSource() == item4[0]){
	   			Color c;
	   			c=JColorChooser.showDialog(null, "����C��",rightcolortextfield.getBackground());
	   			if(c==null){
	   				c=Bpanel[0].getleftcolor();
	   			}
	   			Bpanel[0].setleftcolor(c);
	   			leftcolortextfield.setBackground(c);
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
	   		}
	   		if(event.getSource() == item5[0]){
	   			JOptionPane.showMessageDialog(null, "�{���W�١G�p�p�e�a (2008/6/5)\n�@�̡G�d�F��\n�t�šG�H���j�Ǹ�T�u�{1-A\n�H�c�Gcomdan66@yahoo.com.tw\nMSN  : com-dan-66@hotmail.om\n\n�����S�I�G�L\n", "���� �p�e�a", 1, new ImageIcon("200.gif"));
	   		}
	   		if(event.getSource() == item6_1[0]){
	   			Color c;
	   			c=JColorChooser.showDialog(null, "����C��",rightcolortextfield.getBackground());
	   			if(c==null){
	   				c=Bpanel[0].getleftcolor();
	   			}
	   			Bpanel[0].setleftcolor(c);
	   			leftcolortextfield.setBackground(c);
				filltextfield[0].setBackground(leftcolortextfield.getBackground());
	   		}
	   		if(event.getSource() == item6_1[1]){
	   			Color c;
	   			c=JColorChooser.showDialog(null, "����C��",Bpanel[0].getBackground());
	   			if(c==null){
	   				c=Bpanel[0].getBackground();
	   			}
	   			Bpanel[0].setBackground(c);
	   		}
	   		if(item6_2[0].isSelected()==true){
	   			panel[40].removeAll();
	   			panel[40].setLayout( new GridLayout( 3, 1,1,1) );
	   			panel[40].add(toolbutton[8]);
	   			panel[40].add(toolbutton[13]);
	   			panel[40].add(toolbutton[20]);
	   			repaint();
	   		}
	   		if(item6_2[1].isSelected()==true){
	   			panel[40].removeAll();
	   			panel[40].setLayout( new GridLayout( 4, 3,1,1) );
	   			for(int i=6;i<toolbutton.length;i++){
	   				if(i!=8 && i!= 13 && i!=20){
	   					panel[40].add(toolbutton[i]);
	   				}
	   			}
	   			repaint();
	   		}
	   		if(item6_2[2].isSelected()==true){
	   			panel[40].removeAll();
	   			panel[40].setLayout( new GridLayout( 5, 3,1,1) );
	   			for(int i=6;i<toolbutton.length;i++){
					panel[40].add(toolbutton[i]);
				}
	   			item6_2[0].setSelected(false);
	   			item6_2[1].setSelected(false);
	   			repaint();
	   		}
	   		if(event.getSource() == item7[0]){
		   		JFrame A = new JFrame("�p�p�e�a����");
		   		A.add( new JScrollPane( textarea1 ) );
		        A.setSize( 500, 500 ); 
		        A.setVisible( true );
		   		}
	   		if(event.getSource() == item7[1]){
		   		JFrame A = new JFrame("�����׻���");
		   		A.add( new JScrollPane( textarea2 ) );
		        A.setSize( 500, 500 ); 
		        A.setVisible( true );
	   		}
	   	}
   	}

	public class Painter extends JPanel{
		private MyShape myShape[] = new MyShape[10000];
		private MyLine line;
		private Color leftcolor,rightcolor,color;
		private int big=1,x1,y1,T,x,y,i=-1,x2=-10,y2=-10,x3,y3,x4,y4;
		
		public Painter(){
			sett(2);/*�@�}�l���u��*/
			setleftcolor(new Color(0,0,0));
			setrightcolor(new Color(255,255,255));
			MouseMotionAdapter mm= new MouseMotionAdapter();
			addMouseMotionListener(mm);
			addMouseListener(mm);
		}
		private class MouseMotionAdapter  implements MouseListener,MouseMotionListener{
			public void mousePressed(MouseEvent e){
				item1[0].setEnabled(true);
				item3[0].setEnabled(true);
				i++;i++;
				if(e.isMetaDown()){ color=getrightcolor(); }
				else if( e.isAltDown()){}
				else{ color=getleftcolor(); }
				switch(T){
					case 0:
						if(e.isMetaDown()){ color=getleftcolor(); }
						else if( e.isAltDown()){}
						else{ color=getrightcolor(); }
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 1:
						i--;
						for(int j=0;j<20;j++){
							i++;
							myShape[i]= new MySpray( e.getX(),e.getY(), e.getX(),e.getY(),color,getbig());
						}
						break;
					case 2:
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 3:
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 4:
						if(ch==1){
							x3=e.getX(); y3=e.getY();
						}
						break;
					case 21:
						x3=e.getX(); y3=e.getY();
						break;
				}
				x1=e.getX(); y1=e.getY();
				x=e.getX(); y=e.getY();
				repaint();
			}
			public void mouseDragged(MouseEvent e){
				if(e.isMetaDown()){ color=getrightcolor(); }
				else if( e.isAltDown()){}
				else{ color=getleftcolor(); }
				switch(T){
					case 0:
						i++;
						if(e.isMetaDown()){ color=getleftcolor(); }
						else if( e.isAltDown()){}
						else{ color=getrightcolor(); }
						coordtetextfield.setText(String.format( "%d,%d",e.getX(),e.getY()));
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 1:
						coordtetextfield.setText(String.format( "%d,%d",e.getX(),e.getY()));
						for(int j=0;j<20;j++){
							i++;
							myShape[i]= new MySpray( e.getX(),e.getY(), e.getX(),e.getY(),color,getbig());
						}
						break;
					case 2:
						i++;
						coordtetextfield.setText(String.format( "%d,%d",e.getX(),e.getY()));
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 3:
						i++;
						coordtetextfield.setText(String.format( "%d,%d",e.getX(),e.getY()));
						myShape[i]= new MyLine( x,y, e.getX(),e.getY(),color,getbig());
						break;
					case 4:
						if(ch==1){
							ck=1;
							areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
							line= new MyLine( x1,y1, e.getX(),e.getY(),color,fragmentbig);
							x4=e.getX(); y4=e.getY();
						}
						else{
							areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
							myShape[i]= new MyLine( x1,y1, e.getX(),e.getY(),color,getbig());
						}
						break;
					case 5:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyLine2( x1,y1, e.getX(),e.getY(),color,getbig());
						break;
					case 6:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyRect( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),getFilled(),getbig());
						break;
					case 7:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyOval( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),getFilled(),getbig());
						break;
					case 8:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyRoundRect( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),getFilled(),getbig());
						break;
					case 9:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyCircle( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),getFilled(),getbig());
						break;
					case 10:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MySquare( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),getFilled(),getbig());
						break;
					case 11:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyParallelogram( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 12:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyTrapezoid( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 13:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyRhombus( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 14:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyOctangle( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 15:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyRight_Angled_Triangle( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 16:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyHexagon( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 17:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyCross( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 18:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyPentagon( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 19:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyTriangle( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 20:
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						myShape[i]= new MyCylinder( x1,y1, e.getX(),e.getY(),color,getleftcolor(),getrightcolor(),false,getbig());
						break;
					case 21:
						ck=1;
						areatetextfield.setText(String.format( "%d x %d",e.getX()-x1,e.getY()-y1));
						line= new MyLine( x1,y1, e.getX(),e.getY(),color,fragmentbig);
						x4=e.getX(); y4=e.getY();
						break;
				}
				x=e.getX(); y=e.getY();
				x2=e.getX(); y2=e.getY();
				repaint();
			}
			public void mouseMoved(MouseEvent e){
				x=e.getX(); y=e.getY();
				x2=e.getX(); y2=e.getY();
				coordtetextfield.setText(String.format( "%d,%d",x,y));
				repaint();
			}
			public void mouseClicked(MouseEvent e){ }
			public void mouseEntered(MouseEvent e){ }
			public void mouseExited(MouseEvent e){ 
				x2=-10; y2=-10; repaint();
			}
			public void mouseReleased(MouseEvent e){ 
				areatetextfield.setText(String.format("")); 
				i++; myShape[i]=null; 
			}
		}
		public int getx1( ){ return x3;  }
		public int gety1( ){ return y3;  }
		public int getx2( ){ return x4;  }
		public int gety2( ){ return y4;  }
		public int geti ( ){ return i;   }
		public int getbig(){ return big; }
		public Color getrightcolor(){ return rightcolor; }
		public Color getleftcolor(){ return leftcolor; }
		public boolean getFilled(){ return filled; }
		
		public void setnextmenu(){
			int j;
   			if(b>-1){
				for(j=i-b;j>=0;j++){
					myShape[j] = back[b];
					b--;
					if(back[b]==null){
						myShape[j+1] = back[b];
						b--;
						System.out.printf("b=%d",b);
						break;
					}
				}
				repaint();
				if(b<0){
					item1[0].setEnabled(true);
					item1[1].setEnabled(false);
				}
			}
			else{}
		}
		public void setbackmenu(){
   			int e,j;
   			if(b<i){
   				item1[1].setEnabled(true);
				e=i-(b+1);
				for(j=e;j>=0;j--){
					b++;
					back[b] = myShape[j];
					myShape[j] = null;
					if(myShape[j-1]==null){
						b++;
						back[b] = myShape[j-1];
						myShape[j-1] = null;
						break;
					}
				}
				repaint();
				if(b>=i){ item1[0].setEnabled(false); }
			}
			else{}
		}
		public void setnext(){
			int j;
			if(b>-1){
				for(j=i-b;j>=0;j++){
					myShape[j] = back[b];
					b--;
					
					if(back[b]==null){
						myShape[j+1] = back[b];
						b--;
						System.out.printf("b=%d",b);
						break;
					}
				}
				if(b<0){
					item1[0].setEnabled(true);
					item1[1].setEnabled(false);
				}
				repaint();
			}
			else{ JOptionPane.showMessageDialog( MyFrame.this,"�z�|���e�ϩΨS����!!","ĵ�i", JOptionPane.ERROR_MESSAGE ); }
		}
		public void setback(){
			int j,e;
			if(b<i){
				e=i-(b+1);
				for(j=e;j>=0;j--){
					b++;
					back[b] = myShape[j];
					myShape[j] = null;
					if(myShape[j-1]==null){
						b++;
						back[b] = myShape[j-1];
						myShape[j-1] = null;
						break;
					}
				}
				if(b>=i){
					item1[0].setEnabled(false);
				}
				repaint();
			}
			else{
				JOptionPane.showMessageDialog( MyFrame.this,"�z�|���e�ϩΨS����!!","ĵ�i", JOptionPane.ERROR_MESSAGE );
			}
		}
		public void sett          ( int t  ){ T=t; }
		public void setbig        ( int big){ this.big=big; }
		public void setclear      (        ){ myShape = new MyShape[10000]; i=-1;b=-1; }
		public void setrightcolor ( Color c){ rightcolor=c; }
		public void setleftcolor  ( Color c){ leftcolor=c; }
		public void setlineclear  (        ){ line = null; }
		public void setFilled     ( boolean isFilled ){ filled = isFilled; }
		
		public void paintComponent( Graphics g ){
			super.paintComponent( g );
			Graphics2D g2d = ( Graphics2D ) g; 
			
			if(bug!=null && img==1){
				g2d.drawImage(bug.getImage(), 0, 0,null);
			}
			for(MyShape a: myShape ){
				if(a!=null){ a.draw(g2d); } 
			}
			if(level>=1){ fragment.draw(g2d); }
			if(line!=null && level==0){
				line.setbig(fragmentbig);
				line.setcolor(leftcolor);
			    line.draw(g2d);
			}
			g2d.setPaint(Color.black);
			g2d.setStroke(new BasicStroke());
			g2d.draw( new Line2D.Double( x2, y2-8, x2, y2-2 ));
			g2d.draw( new Line2D.Double( x2, y2+8, x2, y2+2 ));
			g2d.draw( new Line2D.Double( x2-8, y2, x2-2, y2 ));
			g2d.draw( new Line2D.Double( x2+8, y2, x2+2, y2 ));
			g2d.draw(new Ellipse2D.Double(x2-4,y2-4,8,8));
		} 
	}
}