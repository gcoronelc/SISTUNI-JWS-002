namespace NetMonedas
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador requerida.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén utilizando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben eliminar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido del método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.cmbConversion = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtMonto = new System.Windows.Forms.TextBox();
            this.lblerror = new System.Windows.Forms.Label();
            this.btnCalcular = new System.Windows.Forms.Button();
            this.txtResultado = new System.Windows.Forms.TextBox();
            this.lblimprimir = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // cmbConversion
            // 
            this.cmbConversion.FormattingEnabled = true;
            this.cmbConversion.Location = new System.Drawing.Point(228, 35);
            this.cmbConversion.Name = "cmbConversion";
            this.cmbConversion.Size = new System.Drawing.Size(167, 21);
            this.cmbConversion.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(88, 38);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(118, 13);
            this.label1.TabIndex = 1;
            this.label1.Text = "Seleccionar conversion";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(88, 81);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(78, 13);
            this.label2.TabIndex = 2;
            this.label2.Text = "Ingresar Monto";
            // 
            // txtMonto
            // 
            this.txtMonto.Location = new System.Drawing.Point(228, 78);
            this.txtMonto.Name = "txtMonto";
            this.txtMonto.Size = new System.Drawing.Size(100, 20);
            this.txtMonto.TabIndex = 3;
            // 
            // lblerror
            // 
            this.lblerror.AutoSize = true;
            this.lblerror.Location = new System.Drawing.Point(172, 117);
            this.lblerror.Name = "lblerror";
            this.lblerror.Size = new System.Drawing.Size(0, 13);
            this.lblerror.TabIndex = 4;
            // 
            // btnCalcular
            // 
            this.btnCalcular.Location = new System.Drawing.Point(175, 152);
            this.btnCalcular.Name = "btnCalcular";
            this.btnCalcular.Size = new System.Drawing.Size(125, 42);
            this.btnCalcular.TabIndex = 5;
            this.btnCalcular.Text = "Convertir";
            this.btnCalcular.UseVisualStyleBackColor = true;
            this.btnCalcular.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtResultado
            // 
            this.txtResultado.Location = new System.Drawing.Point(282, 229);
            this.txtResultado.Name = "txtResultado";
            this.txtResultado.Size = new System.Drawing.Size(100, 20);
            this.txtResultado.TabIndex = 6;
            // 
            // lblimprimir
            // 
            this.lblimprimir.AutoSize = true;
            this.lblimprimir.Location = new System.Drawing.Point(87, 232);
            this.lblimprimir.Name = "lblimprimir";
            this.lblimprimir.Size = new System.Drawing.Size(0, 13);
            this.lblimprimir.TabIndex = 7;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(466, 276);
            this.Controls.Add(this.lblimprimir);
            this.Controls.Add(this.txtResultado);
            this.Controls.Add(this.btnCalcular);
            this.Controls.Add(this.lblerror);
            this.Controls.Add(this.txtMonto);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.cmbConversion);
            this.Name = "Form1";
            this.Text = "Conversion de Moneda - Paul Mendoza";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ComboBox cmbConversion;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtMonto;
        private System.Windows.Forms.Label lblerror;
        private System.Windows.Forms.Button btnCalcular;
        private System.Windows.Forms.TextBox txtResultado;
        private System.Windows.Forms.Label lblimprimir;
    }
}

