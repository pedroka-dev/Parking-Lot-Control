
package view;

import controller.ListCarBrandControl;
import controller.ListCarModelControl;
import controller.ListCarVersionControl;
import controller.ListPersonControl;
import controller.ListVehicleControl;

public class MainMenuView extends javax.swing.JFrame {
    public MainMenuView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButtonRegCarBrand = new javax.swing.JButton();
        jButtonListCarBrand = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonRegCarModel = new javax.swing.JButton();
        jButtonListCarModel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonRegCarVersion = new javax.swing.JButton();
        jButtonListCarVersion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButtonRegPerson = new javax.swing.JButton();
        jButtonListPerson = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButtonRegVehicle = new javax.swing.JButton();
        jButtonListVehicle = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuList = new javax.swing.JMenu();
        jMenuListCarBrand = new javax.swing.JMenuItem();
        jMenuListCarModel = new javax.swing.JMenuItem();
        jMenuListCarVersion = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuListPerson = new javax.swing.JMenuItem();
        jMenuListVehicle = new javax.swing.JMenuItem();
        jMenuReg = new javax.swing.JMenu();
        jMenuRegCarBrand = new javax.swing.JMenuItem();
        jMenuRegCarModel = new javax.swing.JMenuItem();
        jMenuRegCarVersion = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuRegPerson = new javax.swing.JMenuItem();
        jMenuRegVehicle = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        jToggleButton1.setText("jToggleButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 28)); // NOI18N
        jLabel1.setText("Parking Lot Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonRegCarBrand.setText("Register Brand");
        jButtonRegCarBrand.setToolTipText("");
        jButtonRegCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegCarBrandActionPerformed(evt);
            }
        });

        jButtonListCarBrand.setText("List of Brands");
        jButtonListCarBrand.setToolTipText("");
        jButtonListCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarBrandActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Vehicle Brands");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(jButtonListCarBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegCarBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListCarBrand)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegCarBrand)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegCarModel.setText("Register Model");
        jButtonRegCarModel.setToolTipText("");
        jButtonRegCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegCarModelActionPerformed(evt);
            }
        });

        jButtonListCarModel.setText("List of Models");
        jButtonListCarModel.setToolTipText("");
        jButtonListCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarModelActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Vehicle Models");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonRegCarModel, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addComponent(jButtonListCarModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListCarModel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegCarModel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegCarVersion.setText("Register Version");
        jButtonRegCarVersion.setToolTipText("");
        jButtonRegCarVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegCarVersionActionPerformed(evt);
            }
        });

        jButtonListCarVersion.setText("List of Versions");
        jButtonListCarVersion.setToolTipText("");
        jButtonListCarVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListCarVersionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Vehicle Versions");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonListCarVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegCarVersion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListCarVersion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegCarVersion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRegPerson.setText("Register Owner");
        jButtonRegPerson.setToolTipText("");
        jButtonRegPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegPersonActionPerformed(evt);
            }
        });

        jButtonListPerson.setText("List of  Owners");
        jButtonListPerson.setToolTipText("");
        jButtonListPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListPersonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Owners (Person)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRegPerson, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(jButtonListPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonRegPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonRegVehicle.setText("Register Vehicle");
        jButtonRegVehicle.setToolTipText("");
        jButtonRegVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegVehicleActionPerformed(evt);
            }
        });

        jButtonListVehicle.setText("List of Vehicles");
        jButtonListVehicle.setToolTipText("");
        jButtonListVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListVehicleActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Vehicles");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonListVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonRegVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel9)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonListVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRegVehicle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Database", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Parking lot", jPanel3);

        jMenuList.setText("Lists");

        jMenuListCarBrand.setText("List of Vehicle Brands");
        jMenuListCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListCarBrandActionPerformed(evt);
            }
        });
        jMenuList.add(jMenuListCarBrand);

        jMenuListCarModel.setText("List of Vehicle Models");
        jMenuListCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListCarModelActionPerformed(evt);
            }
        });
        jMenuList.add(jMenuListCarModel);

        jMenuListCarVersion.setText("List of Vehicle Versions");
        jMenuListCarVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListCarVersionActionPerformed(evt);
            }
        });
        jMenuList.add(jMenuListCarVersion);
        jMenuList.add(jSeparator1);

        jMenuListPerson.setText("List of Owners");
        jMenuListPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListPersonActionPerformed(evt);
            }
        });
        jMenuList.add(jMenuListPerson);

        jMenuListVehicle.setText("List of Vehicles");
        jMenuList.add(jMenuListVehicle);

        jMenuBar1.add(jMenuList);

        jMenuReg.setText("Registration");

        jMenuRegCarBrand.setText("Register Vehicle Brands");
        jMenuRegCarBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegCarBrandActionPerformed(evt);
            }
        });
        jMenuReg.add(jMenuRegCarBrand);

        jMenuRegCarModel.setText("Register Vehicle Models");
        jMenuRegCarModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegCarModelActionPerformed(evt);
            }
        });
        jMenuReg.add(jMenuRegCarModel);

        jMenuRegCarVersion.setText("Register  Vehicle Versions");
        jMenuRegCarVersion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegCarVersionActionPerformed(evt);
            }
        });
        jMenuReg.add(jMenuRegCarVersion);
        jMenuReg.add(jSeparator2);

        jMenuRegPerson.setText("Register Owners");
        jMenuRegPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegPersonActionPerformed(evt);
            }
        });
        jMenuReg.add(jMenuRegPerson);

        jMenuRegVehicle.setText("Register Vehicles");
        jMenuRegVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegVehicleActionPerformed(evt);
            }
        });
        jMenuReg.add(jMenuRegVehicle);

        jMenuBar1.add(jMenuReg);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonListCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarBrandActionPerformed
        ListCarBrandView listCarBrandView = new ListCarBrandView();
        ListCarBrandControl listCarBrandControl = new ListCarBrandControl(listCarBrandView);
        listCarBrandView.setVisible(true);
    }//GEN-LAST:event_jButtonListCarBrandActionPerformed

    private void jButtonRegCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegCarBrandActionPerformed
        RegCarBrandView regCarBrandView = new RegCarBrandView();
        //control
        regCarBrandView.setVisible(true);
    }//GEN-LAST:event_jButtonRegCarBrandActionPerformed

    private void jButtonRegCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegCarModelActionPerformed
        RegCarModelView regCarModelView = new RegCarModelView();
        //control
        regCarModelView.setVisible(true);
    }//GEN-LAST:event_jButtonRegCarModelActionPerformed

    private void jButtonListCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarModelActionPerformed
        ListCarModelView listCarModelView = new ListCarModelView();
        ListCarModelControl listCarModelControl = new ListCarModelControl(listCarModelView);
        listCarModelView.setVisible(true);
    }//GEN-LAST:event_jButtonListCarModelActionPerformed

    private void jButtonRegCarVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegCarVersionActionPerformed
        RegCarVersionView regCarVersionView = new RegCarVersionView();
        //control
        regCarVersionView.setVisible(true);
    }//GEN-LAST:event_jButtonRegCarVersionActionPerformed

    private void jButtonListCarVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListCarVersionActionPerformed
        ListCarVersionView listCarVersionView = new ListCarVersionView();
        ListCarVersionControl listCarVersionControl = new ListCarVersionControl(listCarVersionView);
        listCarVersionView.setVisible(true);
    }//GEN-LAST:event_jButtonListCarVersionActionPerformed

    private void jButtonRegPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegPersonActionPerformed
        RegPersonView regPersonView = new RegPersonView();
        //control
        regPersonView.setVisible(true);
    }//GEN-LAST:event_jButtonRegPersonActionPerformed

    private void jButtonListPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListPersonActionPerformed
        ListPersonView listPersonView = new ListPersonView(); 
        ListPersonControl listPersonControl = new ListPersonControl(listPersonView);
        listPersonView.setVisible(true);
    }//GEN-LAST:event_jButtonListPersonActionPerformed

    private void jMenuListCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListCarBrandActionPerformed
        ListCarBrandView listCarBrandView = new ListCarBrandView();
        ListCarBrandControl listCarBrandControl = new ListCarBrandControl(listCarBrandView);
        listCarBrandView.setVisible(true);
    }//GEN-LAST:event_jMenuListCarBrandActionPerformed

    private void jMenuListCarVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListCarVersionActionPerformed
        ListCarVersionView listCarVersionView = new ListCarVersionView();
        ListCarVersionControl listCarVersionControl = new ListCarVersionControl(listCarVersionView);
        listCarVersionView.setVisible(true);
    }//GEN-LAST:event_jMenuListCarVersionActionPerformed

    private void jMenuListCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListCarModelActionPerformed
        ListCarModelView listCarModelView = new ListCarModelView();
        ListCarModelControl listCarModelControl = new ListCarModelControl(listCarModelView);
        listCarModelView.setVisible(true);
    }//GEN-LAST:event_jMenuListCarModelActionPerformed

    private void jMenuListPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListPersonActionPerformed
        ListPersonView listPersonView = new ListPersonView(); 
        ListPersonControl listPersonControl = new ListPersonControl(listPersonView);
        listPersonView.setVisible(true);
    }//GEN-LAST:event_jMenuListPersonActionPerformed

    private void jMenuRegCarBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegCarBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegCarBrandActionPerformed

    private void jMenuRegCarModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegCarModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegCarModelActionPerformed

    private void jMenuRegCarVersionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegCarVersionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegCarVersionActionPerformed

    private void jMenuRegPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegPersonActionPerformed

    private void jButtonListVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListVehicleActionPerformed
        ListVehicleView listVehicleView = new ListVehicleView();
        ListVehicleControl listVehicleControl = new ListVehicleControl(listVehicleView);
        listVehicleView.setVisible(true);
    }//GEN-LAST:event_jButtonListVehicleActionPerformed

    private void jButtonRegVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegVehicleActionPerformed
        RegVehicleView RegVehicleView = new RegVehicleView();
        //control
        RegVehicleView.setVisible(true);
    }//GEN-LAST:event_jButtonRegVehicleActionPerformed

    private void jMenuRegVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuRegVehicleActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonListCarBrand;
    private javax.swing.JButton jButtonListCarModel;
    private javax.swing.JButton jButtonListCarVersion;
    private javax.swing.JButton jButtonListPerson;
    private javax.swing.JButton jButtonListVehicle;
    private javax.swing.JButton jButtonRegCarBrand;
    private javax.swing.JButton jButtonRegCarModel;
    private javax.swing.JButton jButtonRegCarVersion;
    private javax.swing.JButton jButtonRegPerson;
    private javax.swing.JButton jButtonRegVehicle;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuList;
    private javax.swing.JMenuItem jMenuListCarBrand;
    private javax.swing.JMenuItem jMenuListCarModel;
    private javax.swing.JMenuItem jMenuListCarVersion;
    private javax.swing.JMenuItem jMenuListPerson;
    private javax.swing.JMenuItem jMenuListVehicle;
    private javax.swing.JMenu jMenuReg;
    private javax.swing.JMenuItem jMenuRegCarBrand;
    private javax.swing.JMenuItem jMenuRegCarModel;
    private javax.swing.JMenuItem jMenuRegCarVersion;
    private javax.swing.JMenuItem jMenuRegPerson;
    private javax.swing.JMenuItem jMenuRegVehicle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
