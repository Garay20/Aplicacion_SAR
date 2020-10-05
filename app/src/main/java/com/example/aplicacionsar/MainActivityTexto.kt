package com.example.aplicacionsar

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivityTexto : AppCompatActivity() {

    var tvtitulo: TextView? = null
    var tvtexto: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_texto)



        tvtitulo = findViewById(R.id.txttitulo)
        tvtexto = findViewById(R.id.txttexto)

        val textoData = intent.getStringExtra("com.estudio.aplicacion sar.MainActivity.PAGINA")
        Toast.makeText(this, textoData, Toast.LENGTH_SHORT).show()

        val inscripcion = paginatexto("Inscripciòn de RTN", "Requisitos persona natural:::::\n" +
                "\n"+
                "Llenar y firmar la declaración Jurada de Inscripción/Actualización de Persona Natural, en el formulario SAR-410.\n" +
                "1.\tTarjeta de Identidad para hondureños (Original y Fotocopia).\n" +
                "2.\tPasaporte o Carné de Residente para extranjeros (Original y Fotocopia).\n" +
                "3.\tOriginal y Fotocopia del Documento que acredite su dirección exacta:\n" +
                "•\tRecibo de un Servicio Público.\n" +
                "•\tContrato de Alquiler o Arrendamiento Comercial.\n" +
                "•\tConstancia de la Vecindad.\n" +
                "•\tRecibo de suscripción de Servicios Privados (Internet, cable, telefonía).\n" +
                "4.\tEn caso de ser solicitado por un representante procesal o apoderado legal, se deberá de identificar lo siguiente:\n" +
                "•\tSi tiene facultades para compadecer a realizar el trámite\n" +
                "•\tSi tiene facultades para firmar\n" +
                "•\tSi tiene facultades únicamente para presentar y no firmar, deberá de presentar el formulario 410 firmado por el Obligado Tributario\n" +
                "Este deberá acompañar original y fotocopia del poder o carta poder debidamente autenticado y fotocopia de su Tarjeta de Identidad.\n")
        val actualizacion = paginatexto("Actualizaciòn de RTN", "Persona Natural/ Comerciante Individual \n" +
                "\n" +
                "1)\tTarjeta de Identidad para hondureños (Original y Fotocopia); \n" +
                "2)\tPasaporte o Carné de Residente para extranjeros (Original y Fotocopia); \n" +
                "3)\tLlenar y firmar Declaración Jurada de Inscripción/Actualización de Persona Natural, Formulario SAR-410; \n" +
                "4)\tLlenar y firmar Formulario Anexo 410 A; Declaración Jurada de Inscripciones, Inicio de Actividades y Actualización al Registro Tributario Nacional. En caso de (Establecimientos, Agencias o Sucursales); \n" +
                "5)\tDocumento Original y Fotocopia del Permiso de Operaciones o solicitud de trámite presentada en la Alcaldía Municipal (Establecimientos, Agencias o Sucursales de Comerciantes Individuales). \n" +
                "6)\tComprobante de Domicilio que contenga la dirección exacta: original y fotocopia de los siguientes documentos. o Recibo de un Servicio Público. \n" +
                "•\tContrato de Alquiler o Arrendamiento Comercial. \n" +
                "•\tConstancia de la Vecindad (Persona Natural). \n" +
                "•\tRecibo de suscripción de Servicios Privados (Internet, cable, telefonía). \n")
        val aceptacion = paginatexto("Aceptación, actualización de contrato de adhesión", "•\tContrato de Adhesión debidamente firmado por el Representante Legal. \n" +
                "•\tFotocopia de tarjeta de identidad o carné de residencia del Representante Legal. \n" +
                "•\tOriginal de la solicitud actualización o recisión del contrato de adhesión \n" +
                "•\tEn caso de ser solicitado por un representante procesal o apoderado legal, se deberá de identificar lo siguiente: \n" +
                "1. Si tiene facultades para comparecer a realizar el trámite \n" +
                "2. Si tiene facultades para firmar \n" +
                "3. Si tiene facultades únicamente para presentar y no firmar, deberá de presentar el formulario 410 firmado por el Obligado Tributario \n" +
                "Este deberá acompañar original y fotocopia del poder o carta poder debidamente autenticado y fotocopia de su Tarjeta de Identidad, no será requerida la presentación del documento original de la Tarjeta de Identidad, Pasaporte o Carné de Residencia de la persona representada.\n")
        val declaracion = paginatexto("Declaracion de inico de operaciones", "Requisitos mediante Ventanilla de Asistencia al Cumplimiento\n" +
                "\n" +
                "Inicio de Operaciones de la Principal \n" +
                "1)\tLlenar y firmar Declaración Jurada de Inscripciones, Inicio de Actividades y Actualización al Registro Tributario Nacional Formulario SAR-410.\n" +
                "2)\tTarjeta de identidad o carné de residencia del Obligado Tributario o Representante Legal (Fotocopia).\n" +
                "\n" +
                "Inicio de Operaciones de la Sucursal \n" +
                "1)\tLlenar y firmar Declaración Jurada de Inscripciones, Inicio de Actividades y Actualización al Registro Tributario Nacional Formulario SAR-410 (Persona Jurídica o Comerciantes Individuales).\n" +
                "2)\tTarjeta de identidad o carné de residencia del Obligado Tributario o Representante Legal (Fotocopia).\n" +
                "3)\tPermiso o Constancia de Operación de la Alcaldía Municipal, en caso de Establecimientos, Agencias o sucursales) (Fotocopia).\n")

        if(textoData == "Inscripcion RTN"){
            tvtitulo?.text = inscripcion.titulo
            tvtexto?.text = inscripcion.texto

        } else if (textoData == "Actualizacion RTN"){
            tvtitulo?.text = actualizacion.titulo
            tvtexto?.text = actualizacion.texto
        } else if (textoData == "Aceptacion"){
            tvtitulo?.text = aceptacion.titulo
            tvtexto?.text = aceptacion.texto
        } else if (textoData == "Declaracion de inicio de operaciones"){
            tvtitulo?.text = declaracion.titulo
            tvtexto?.text = declaracion.texto
        }
    }
}