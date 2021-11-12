
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.Timer;
import jssc.SerialPort;
import jssc.SerialPortException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lordsinsentido
 */
public class Principal extends javax.swing.JFrame {
    private ConexionBaseDeDatos conexionBaseDeDatos;
    private Connection conexion;
    private Usuario usuarioAutenticado;
    
    private SerialPort puerto;
    
    private boolean seInicioSesion = false;

    /**
     * Creates new form Principal
     */
    public Principal() {
        try {
            conexionBaseDeDatos = new ConexionBaseDeDatos();
            conexion = conexionBaseDeDatos.conexion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        initComponents();
        
        //desactivarPestannas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestannasMenu = new javax.swing.JTabbedPane();
        panelLogin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginEntradaUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        loginEntradaContrasenna = new javax.swing.JPasswordField();
        loginBotonIniciarSesión = new javax.swing.JButton();
        loginBotonCerrarSesion = new javax.swing.JButton();
        loginTextoAlerta = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        controlBotonEncender = new javax.swing.JButton();
        controlBotonApagar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        controlSliderVelocidad = new javax.swing.JSlider();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelAgregar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admonEntradaNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        admonEntradaApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        admonEntradaUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        admonEntradaContrasenna = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        admonOpcionesRol = new javax.swing.JComboBox<>();
        admonBotonCrearUsuario = new javax.swing.JButton();
        admonTextoAlerta = new javax.swing.JLabel();
        panelAdmon = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de banda de producción");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(100, 100));

        panelLogin.setEnabled(false);

        jLabel7.setText("Inicio de sesión");

        jLabel8.setText("Nombre de usuario");

        jLabel9.setText("Contraseña");

        loginBotonIniciarSesión.setText("Iniciar sesión");
        loginBotonIniciarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBotonIniciarSesiónActionPerformed(evt);
            }
        });

        loginBotonCerrarSesion.setText("Cerrar sesión");
        loginBotonCerrarSesion.setEnabled(false);
        loginBotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginEntradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginEntradaContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(loginBotonIniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBotonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginTextoAlerta))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(loginEntradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(loginEntradaContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBotonIniciarSesión)
                    .addComponent(loginBotonCerrarSesion))
                .addGap(18, 18, 18)
                .addComponent(loginTextoAlerta)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pestannasMenu.addTab("Inciar sesión", panelLogin);

        panelControl.setEnabled(false);

        jLabel10.setText("Control de la banda de producción");

        jLabel11.setText("Seleccionar estado");

        controlBotonEncender.setText("Encender");
        controlBotonEncender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBotonEncenderActionPerformed(evt);
            }
        });

        controlBotonApagar.setText("Apagar");

        jLabel12.setText("Dirección de la banda");

        jButton3.setText("Adelante");

        jButton4.setText("Atrás");

        jButton5.setText("Manual");

        jLabel13.setText("Velocidad");

        jLabel14.setText("Más lento");

        jLabel15.setText("Más rápido");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addComponent(controlBotonEncender, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(controlBotonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13)
                    .addComponent(controlSliderVelocidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controlBotonEncender)
                    .addComponent(controlBotonApagar))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlSliderVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(242, Short.MAX_VALUE))
        );

        pestannasMenu.addTab("Control de la banda", panelControl);

        panelAgregar.setEnabled(false);

        jLabel1.setText("Crear usuario nuevo");

        jLabel2.setText("Nombre");

        admonEntradaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admonEntradaNombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        admonEntradaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admonEntradaApellidoActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de usuario");

        jLabel5.setText("Contraseña");

        jLabel6.setText("Rol");

        admonOpcionesRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Administrador" }));
        admonOpcionesRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admonOpcionesRolActionPerformed(evt);
            }
        });

        admonBotonCrearUsuario.setText("Crear usuario");
        admonBotonCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admonBotonCrearUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAgregarLayout = new javax.swing.GroupLayout(panelAgregar);
        panelAgregar.setLayout(panelAgregarLayout);
        panelAgregarLayout.setHorizontalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admonEntradaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admonEntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admonEntradaContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admonOpcionesRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(admonBotonCrearUsuario)
                    .addGroup(panelAgregarLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admonEntradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(admonTextoAlerta))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        panelAgregarLayout.setVerticalGroup(
            panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admonEntradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(admonEntradaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(admonEntradaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(admonEntradaContrasenna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(admonOpcionesRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(admonBotonCrearUsuario)
                .addGap(18, 18, 18)
                .addComponent(admonTextoAlerta)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pestannasMenu.addTab("Agregar usuario", panelAgregar);

        jLabel16.setText("Administración de usuario registrados");

        javax.swing.GroupLayout panelAdmonLayout = new javax.swing.GroupLayout(panelAdmon);
        panelAdmon.setLayout(panelAdmonLayout);
        panelAdmonLayout.setHorizontalGroup(
            panelAdmonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdmonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(332, Short.MAX_VALUE))
        );
        panelAdmonLayout.setVerticalGroup(
            panelAdmonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdmonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        pestannasMenu.addTab("Administrar usuarios", panelAdmon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pestannasMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pestannasMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void admonEntradaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admonEntradaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admonEntradaNombreActionPerformed

    private void admonEntradaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admonEntradaApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admonEntradaApellidoActionPerformed

    private void admonOpcionesRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admonOpcionesRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admonOpcionesRolActionPerformed

    private void admonBotonCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admonBotonCrearUsuarioActionPerformed
        try {
            PreparedStatement agregarUsuario = conexion.prepareStatement("INSERT INTO usuarios VALUES(?,?,?,?,?,?);"); // Se crea el statement encargado de conectar con la base de datos y realizar la acción en ella
            
            if(!admonEntradaUsuario.getText().isEmpty() && !admonEntradaContrasenna.getText().isEmpty() && !admonEntradaNombre.getText().isEmpty() && !admonEntradaApellido.getText().isEmpty()){
                agregarUsuario.setString(2, admonEntradaUsuario.getText().trim());
                agregarUsuario.setString(3, admonEntradaContrasenna.getText().trim());
                agregarUsuario.setString(4, admonEntradaNombre.getText().trim());
                agregarUsuario.setString(5, admonEntradaApellido.getText().trim());
                agregarUsuario.setInt(6, admonOpcionesRol.getSelectedIndex());

                agregarUsuario.executeUpdate();

                admonEntradaUsuario.setText("");
                admonEntradaContrasenna.setText("");
                admonEntradaNombre.setText("");
                admonEntradaApellido.setText("");
                admonOpcionesRol.setSelectedIndex(0);

                admonTextoAlerta.setText("Se ha agregado el usuario a la base de datos");
            }else{
                admonTextoAlerta.setText("No se han introducido todos los campos necesarios para hacer el registro");
            }
            
        } catch (Exception e) {
            admonTextoAlerta.setText("No se pudo conectar con la base de datos");
        }
    }//GEN-LAST:event_admonBotonCrearUsuarioActionPerformed

    private void loginBotonIniciarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBotonIniciarSesiónActionPerformed
        try {   // Se manda la petición a la base de datos
            Statement iniciarSesion = conexion.createStatement();   // Se crea el statement encargado de realizar la conexión y acción a la base de datos
            ResultSet resultado = iniciarSesion.executeQuery("SELECT id, usuario, contrasenna, nombre, apellidos, rol FROM usuarios WHERE usuario = '" + loginEntradaUsuario.getText().trim() + "';");   // Se le asigna el comando a ejecutar, y posterior a ello, se guardan los resultados
            
            while(resultado.next()) {  // Aquí se busca entre los resultados al usuario que trata de iniciar sesión
                if(resultado.getString(2).equals(loginEntradaUsuario.getText().trim()) && resultado.getString(3).equals(loginEntradaContrasenna.getText().trim())) {   // Se busca que el resultado que se encontró contenga el mismo usuario y la misma contraseña, si fue encontrado, ejecutará las siguientes líneas de código
                    seInicioSesion = true;   // Se establece que se ha iniciado sesión
                    usuarioAutenticado = new Usuario(resultado.getInt(1), resultado.getString(2), resultado.getString(4), resultado.getString(5), resultado.getInt(6));
                    
                    switch(usuarioAutenticado.getRol()) {
                        case 0 :
                            pestannasMenu.setEnabledAt(1, true);
                            break;
                        case 1 :
                            pestannasMenu.setEnabledAt(1, true);
                            pestannasMenu.setEnabledAt(2, true);
                            pestannasMenu.setEnabledAt(3, true);
                            break;
                    }
                    
                    loginEntradaUsuario.setEditable(false);
                    loginEntradaContrasenna.setText("Protegemos tu contrasenna quitándola");
                    loginEntradaContrasenna.setEditable(false);
                    loginBotonIniciarSesión.setEnabled(false);
                    loginBotonCerrarSesion.setEnabled(true);
                    
                    loginTextoAlerta.setText("Bienvenido " + usuarioAutenticado.getNombre() + " " + usuarioAutenticado.getApellido());
                    
                }else{   // Si no fue encontrado, se ejecutarán las siguientes líneas de código
                    loginTextoAlerta.setText("No se ha encontrado el usuario, revisa tus credenciales y vuelve a intentarlo");
                }
            }
            
        } catch (Exception e) {
            admonTextoAlerta.setText("No se pudo conectar con la base de datos");
        }
    }//GEN-LAST:event_loginBotonIniciarSesiónActionPerformed

    private void loginBotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBotonCerrarSesionActionPerformed
        desactivarPestannas();
        
        usuarioAutenticado = null;
        
        loginEntradaUsuario.setEditable(true);
        loginEntradaContrasenna.setEditable(true);
        loginEntradaContrasenna.setText("");
        loginBotonIniciarSesión.setEnabled(true);
        loginBotonCerrarSesion.setEnabled(false);
        
        loginTextoAlerta.setText("Se ha cerrado tu sesión");
    }//GEN-LAST:event_loginBotonCerrarSesionActionPerformed

    private void controlBotonEncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBotonEncenderActionPerformed
        try {   // Se intenta realizar la conexión con el puerto serial, si se logra conectar ejecutará el siguiente código
            puerto = new SerialPort("/dev/ttyACM0");   // Se especifica el puerto al que se trata de conectar
            puerto.openPort();   // Se inicializa el puerto
            puerto.setParams(SerialPort.BAUDRATE_19200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);   // Se establecen los parámetros que tendrá la conexión

            
            
        } catch (SerialPortException ex) {   // En caso de que no se haya podido conectar, ejecutará el siguiente código
        }
    }//GEN-LAST:event_controlBotonEncenderActionPerformed

    private void desactivarPestannas() {   // Función que deshabilita las pestañas del programa para que el usuario no pueda acceder a ellas
        for(int i = 1; i < 4; i++) {
            pestannasMenu.setEnabledAt(i, false);
        }
    }
    
    private Timer temporizador = new Timer(1500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                puerto.writeString("a");
                System.out.println("Enviado...");
            } catch (SerialPortException ex) {
                System.out.println(ex.getMessage());
            }
        }
    });
    
     
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admonBotonCrearUsuario;
    private javax.swing.JTextField admonEntradaApellido;
    private javax.swing.JPasswordField admonEntradaContrasenna;
    private javax.swing.JTextField admonEntradaNombre;
    private javax.swing.JTextField admonEntradaUsuario;
    private javax.swing.JComboBox<String> admonOpcionesRol;
    private javax.swing.JLabel admonTextoAlerta;
    private javax.swing.JButton controlBotonApagar;
    private javax.swing.JButton controlBotonEncender;
    private javax.swing.JSlider controlSliderVelocidad;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginBotonCerrarSesion;
    private javax.swing.JButton loginBotonIniciarSesión;
    private javax.swing.JPasswordField loginEntradaContrasenna;
    private javax.swing.JTextField loginEntradaUsuario;
    private javax.swing.JLabel loginTextoAlerta;
    private javax.swing.JPanel panelAdmon;
    private javax.swing.JPanel panelAgregar;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JTabbedPane pestannasMenu;
    // End of variables declaration//GEN-END:variables
}
