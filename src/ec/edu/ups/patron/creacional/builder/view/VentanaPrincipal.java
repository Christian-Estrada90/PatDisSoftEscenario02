package ec.edu.ups.patron.creacional.builder.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import ec.edu.ups.patron.creacional.builder.controller.ActivoFijoBuilder;
import ec.edu.ups.patron.creacional.builder.model.ActivoFijo;

/**
 * 
 * @author Grupo 3
 *
 */
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
		lblCodigo = new javax.swing.JLabel();
		lblNombre = new javax.swing.JLabel();
		lblPrecio = new javax.swing.JLabel();
		lblProcesador = new javax.swing.JLabel();
		lblMemoriaRam = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		lblPlaca = new javax.swing.JLabel();
		lblNumChasis = new javax.swing.JLabel();
		lblNumCajones = new javax.swing.JLabel();
		lblNumPatas = new javax.swing.JLabel();
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
		lblActivosFijos = new javax.swing.JLabel();
		cmbTipo = new javax.swing.JComboBox<>();
		lblTipo = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblInformacion = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setLayout(new java.awt.GridLayout(1, 0));

		lblCodigo.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblCodigo.setText("Codigo:");

		lblNombre.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblNombre.setText("Nombre:");

		lblPrecio.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblPrecio.setText("Precio:");

		lblProcesador.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblProcesador.setText("Procesador:");

		lblMemoriaRam.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblMemoriaRam.setText("Memoria Ram:");

		lblPlaca.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblPlaca.setText("Placa:");

		lblNumChasis.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblNumChasis.setText("Número Chasis:");

		lblNumCajones.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblNumCajones.setText("Número Cajones:");

		lblNumPatas.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblNumPatas.setText("Número Patas:");

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
				btnCrearActivo(evt);
			}
		});

		lblActivosFijos.setFont(new java.awt.Font("Arial Narrow", 0, 14));
		lblActivosFijos.setText("ACTIVOS FIJOS");

		cmbTipo.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		cmbTipo.setModel(
				new javax.swing.DefaultComboBoxModel<>(new String[] { "COMPUTADOR", "MESA", "SILLA", "AUTO" }));
		cmbTipo.addItemListener(new java.awt.event.ItemListener() {
			public void itemStateChanged(java.awt.event.ItemEvent evt) {
				cmbTipoChanged(evt);
			}
		});

		lblTipo.setFont(new java.awt.Font("Arial Narrow", 0, 12));
		lblTipo.setText("TIPO:");

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
												.addComponent(lblCodigo).addComponent(lblNombre).addComponent(lblPrecio)
												.addComponent(lblProcesador))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(lblNumCajones).addComponent(lblNumChasis).addComponent(lblNumPatas))
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
												.addComponent(lblMemoriaRam)
												.addGroup(layout.createSequentialGroup().addComponent(lblPlaca)
														.addPreferredGap(
																javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jLabel6)))
										.addGap(22, 22, 22)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtPlaca).addComponent(txtMemoriaRam)
												.addComponent(txtProcesador).addComponent(txtPrecio)
												.addComponent(txtNombre).addComponent(txtCodigo)))
								.addGroup(layout.createSequentialGroup().addComponent(lblTipo).addGap(18, 18, 18)
										.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 65, Short.MAX_VALUE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(layout.createSequentialGroup().addGap(49, 49, 49).addComponent(lblActivosFijos).addGap(0, 0,
						Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addComponent(lblActivosFijos)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTipo))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblCodigo).addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNombre).addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblPrecio).addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblProcesador).addComponent(txtProcesador,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMemoriaRam).addComponent(txtMemoriaRam,
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
												.addComponent(lblPlaca).addComponent(txtPlaca,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblNumChasis).addComponent(txtNumeroChasis,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNumCajones).addComponent(txtNumeroCajones,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblNumPatas).addComponent(txtNumeroPatas,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(btnCrear)
						.addGap(0, 0, Short.MAX_VALUE))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
				.addContainerGap()));

		pack();
	}

	private void btnCrearActivo(java.awt.event.ActionEvent evt) {
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

		activoFijoBuilder.addCodigo(
				Integer.parseInt(txtCodigo.getText())).addNombre(txtNombre.getText())
				.addPrecio(Double.valueOf(txtPrecio.getText()))
				.addProcesador(txtProcesador.getText())
				.addMemoriaRam(txtMemoriaRam.getText())
				.addPLaca(txtPlaca.getText())
				.addNumeroChasis(txtNumeroChasis.getText())
				.addNumeroCajones(numeroCajones)
				.addNumeroPatas(numeroPatas);

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

	private void cmbTipoChanged(java.awt.event.ItemEvent evt) {
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

	private javax.swing.JButton btnCrear;
	private javax.swing.JComboBox<String> cmbTipo;
	private javax.swing.JLabel lblCodigo;
	private javax.swing.JLabel lblNumPatas;
	private javax.swing.JLabel lblActivosFijos;
	private javax.swing.JLabel lblTipo;
	private javax.swing.JLabel lblNombre;
	private javax.swing.JLabel lblPrecio;
	private javax.swing.JLabel lblProcesador;
	private javax.swing.JLabel lblMemoriaRam;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel lblPlaca;
	private javax.swing.JLabel lblNumChasis;
	private javax.swing.JLabel lblNumCajones;
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
}