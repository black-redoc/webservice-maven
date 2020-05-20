//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.05.20 a las 11:35:49 AM COT 
//


package com.sebas.webservicecbco.checkout;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para addAudit complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="addAudit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditoria" type="{http://ws.checkout.credibanco.pharos.com/}audit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addAudit", propOrder = {
    "auditoria"
})
public class AddAudit {

    protected Audit auditoria;

    /**
     * Obtiene el valor de la propiedad auditoria.
     * 
     * @return
     *     possible object is
     *     {@link Audit }
     *     
     */
    public Audit getAuditoria() {
        return auditoria;
    }

    /**
     * Define el valor de la propiedad auditoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Audit }
     *     
     */
    public void setAuditoria(Audit value) {
        this.auditoria = value;
    }

}
