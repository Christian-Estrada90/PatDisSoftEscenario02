package ec.edu.ups.patron.creacional.builder.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ec.edu.ups.patron.creacional.builder.controller.ActivoFijoBuilder;
import ec.edu.ups.patron.creacional.builder.model.ActivoFijo;

public class VentanaPrincipal extends javax.swing.JFrame {
	DefaultTableModel tblModel = new DefaultTableModel();

	public VentanaPrincipal() {
		initComponents();
		tblModel.addColumn("Tipo");
		tblModel.addColumn("Codigo");
		tblModel.addColumn("Nombre");
		tblModel.addColumn("Precio");
		tblModel.addColumn("Procesador");
		tblModel.addColumn("Memoria Ram");
		tblModel.addColumn("Placa");
		tblModel.addColumn("Num. Chasis");
		tblModel.addColumn("Num. Cajones");
		tblModel.addColumn("Num. Patas");
		tblInformacion.setModel(tblModel);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		txtCodigo = new javax.swing.JTextField();
		txtNombre = new javax.swing.JTextField();
		txtPrecio = new javax.swing.JTextField();
		txtProcesador = new javax.swing.JTextField();
		txtMemoriaRam = new javax.swing.JTextField();
		txtPlaca = new javax.swing.JTextField();
		txtNumeroChasis = new javax.swing.JTextField();
		txtNumeroCajones = new javax.swing.JTextField();
		txtNumeroPatas = new javax.swing.JTextField();
		btnCrear = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		cmbTipo = new javax.swing.JComboBox<>();
		jLabel12 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblInformacion = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(new java.awt.GridLayout(1, 0));

		jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel1.setText("Codigo:");

		jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel2.setText("Nombre:");

		jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel3.setText("Precio:");

		jLabel4.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel4.setText("Procesador:");

		jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel5.setText("Memoria Ram:");

		jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel7.setText("Placa:");

		jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel8.setText("Número Chasis:");

		jLabel9.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel9.setText("Número Cajones:");

		jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel10.setText("Número Patas:");

		txtCodigo.setFont(new java.awt.Font("Arial Narrow", 0, 12));

		txtNombre.setFont(new java.awt.Font("Arial Narrow", 0, 12));

		txtPrecio.setFont(new java.awt.Font("Arial Narrow", 0, 12));

		txtProcesador.setFont(new java.awt.Font("Arial Narrow", 0, 12));

		txtMemoriaRam.setFont(new java.awt.Font("Arial Narrow", 0, 12));

		txtPlaca.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		txtPlaca.setEnabled(false);

		txtNumeroChasis.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		txtNumeroChasis.setEnabled(false);

		txtNumeroCajones.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		txtNumeroCajones.setEnabled(false);

		txtNumeroPatas.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		txtNumeroPatas.setEnabled(false);

		btnCrear.setText("Crear");
		btnCrear.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCrearActionPerformed(evt);
			}
		});

		jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 14));
		jLabel11.setText("ACTIVOS FIJOS");

		cmbTipo.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		cmbTipo.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTADOR", "MESA", "SILLA", "AUTO" }));
		cmbTipo.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cmbTipoItemStateChanged(evt);
			}
		});

		jLabel12.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		jLabel12.setText("TIPO:");

		tblInformacion
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(tblInformacion);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24, 24, 24)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3)
												.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel9).addComponent(jLabel8).addComponent(jLabel10))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(txtNumeroChasis)
												.addComponent(txtNumeroPatas, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtNumeroCajones,
														javax.swing.GroupLayout.Alignment.LEADING)))
								.addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5)
												.addGroup(layout.createSequentialGroup().addComponent(jLabel7)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel6)))
										.addGap(22, 22, 22)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtPlaca).addComponent(txtMemoriaRam)
												.addComponent(txtProcesador).addComponent(txtPrecio)
												.addComponent(txtNombre).addComponent(txtCodigo)))
								.addGroup(layout.createSequentialGroup().addComponent(jLabel12).addGap(18, 18, 18)
										.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 65, Short.MAX_VALUE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(49, 49, 49).addComponent(jLabel11).addGap(0, 0,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addComponent(jLabel11)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel12))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3).addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4).addComponent(txtProcesador,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(txtMemoriaRam,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addComponent(jLabel6)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7).addComponent(txtPlaca,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel8).addComponent(txtNumeroChasis,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel9).addComponent(txtNumeroCajones,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel10).addComponent(txtNumeroPatas,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnCrear)
						.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
				.addContainerGap()));

		pack();
	}

	private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {
		if (txtCodigo.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un Codigo");
			return;
		}
		if (txtNombre.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un Nombre");
			return;
		}
		if (txtPrecio.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Ingrese un Precio");
			return;
		}

		var activoFijoBuilder = new ActivoFijoBuilder();

		int numeroPatas = 0;
		if (cmbTipo.getSelectedItem().toString().equals("SILLA")) {
			numeroPatas = Integer.parseInt(txtNumeroPatas.getText());
		}
		int numeroCajones = 0;
		if (cmbTipo.getSelectedItem().toString().equals("MESA")) {
			numeroCajones = Integer.parseInt(txtNumeroCajones.getText());
		}

		activoFijoBuilder.addCodigo(Integer.parseInt(txtCodigo.getText())).addNombre(txtNombre.getText())
				.addPrecio(Double.valueOf(txtPrecio.getText())).addProcesador(txtProcesador.getText())
				.addMemoriaRam(txtMemoriaRam.getText()).addPLaca(txtPlaca.getText())
				.addNumeroChasis(txtNumeroChasis.getText()).addNumeroCajones(numeroCajones).addNumeroPatas(numeroPatas);

		ActivoFijo activoFijo = activoFijoBuilder.construir();

		tblModel.addRow(new Object[] { cmbTipo.getSelectedItem().toString(), activoFijo.getCodigo(),
				activoFijo.getNombre(), activoFijo.getPrecio(), activoFijo.getProcesador(), activoFijo.getMemoriaRam(),
				activoFijo.getPlaca(), activoFijo.getNumeroChasis(), activoFijo.getNumeroCajones(),
				activoFijo.getNumeroPatas() });

		txtCodigo.setText("");
		txtNombre.setText("");
		txtPrecio.setText("");
		txtProcesador.setText("");
		txtMemoriaRam.setText("");
		txtPlaca.setText("");
		txtNumeroChasis.setText("");
		txtNumeroCajones.setText("");
		txtNumeroPatas.setText("");
		JOptionPane.showMessageDialog(null, "Activo Fijo Creado Correctamente");

	}

	private void cmbTipoItemStateChanged(java.awt.event.ItemEvent evt) {
		if (cmbTipo.getSelectedItem().toString().equals("COMPUTADOR")) {
			txtMemoriaRam.setEnabled(true);
			txtProcesador.setEnabled(true);

			txtNumeroCajones.setEnabled(false);
			txtNumeroPatas.setEnabled(false);
			txtNumeroChasis.setEnabled(false);
			txtPlaca.setEnabled(false);
		}

		if (cmbTipo.getSelectedItem().toString().equals("MESA")) {
			txtNumeroCajones.setEnabled(true);

			txtNumeroPatas.setEnabled(false);
			txtMemoriaRam.setEnabled(false);
			txtProcesador.setEnabled(false);
			txtNumeroChasis.setEnabled(false);
			txtPlaca.setEnabled(false);
		}

		if (cmbTipo.getSelectedItem().toString().equals("AUTO")) {
			txtNumeroChasis.setEnabled(true);
			txtPlaca.setEnabled(true);

			txtNumeroCajones.setEnabled(false);
			txtNumeroPatas.setEnabled(false);
			txtMemoriaRam.setEnabled(false);
			txtProcesador.setEnabled(false);
		}

		if (cmbTipo.getSelectedItem().toString().equals("SILLA")) {
			txtNumeroPatas.setEnabled(true);

			txtNumeroChasis.setEnabled(false);
			txtPlaca.setEnabled(false);
			txtNumeroCajones.setEnabled(false);
			txtMemoriaRam.setEnabled(false);
			txtProcesador.setEnabled(false);
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VentanaPrincipal().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnCrear;
	private javax.swing.JComboBox<String> cmbTipo;
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
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tblInformacion;
	private javax.swing.JTextField txtCodigo;
	private javax.swing.JTextField txtMemoriaRam;
	private javax.swing.JTextField txtNombre;
	private javax.swing.JTextField txtNumeroCajones;
	private javax.swing.JTextField txtNumeroChasis;
	private javax.swing.JTextField txtNumeroPatas;
	private javax.swing.JTextField txtPlaca;
	private javax.swing.JTextField txtPrecio;
	private javax.swing.JTextField txtProcesador;
	// End of variables declaration//GEN-END:variables
}