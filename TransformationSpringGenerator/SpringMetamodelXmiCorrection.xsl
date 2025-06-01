<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:metamodelSpringGenerator="http://metamodelSpringGenerator"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    exclude-result-prefixes="xmi metamodelSpringGenerato xsi">

  <!-- Declarar salida con encoding UTF-8 -->
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>

  <!-- Identidad: copia todo por defecto -->
  <xsl:template match="@*|node()">
    <xsl:copy>
      <xsl:apply-templates select="@*|node()"/>
    </xsl:copy>
  </xsl:template>

  <!-- Modificar el nodo raíz springmetamodel:App -->
  <xsl:template match="metamodelSpringGenerator:App">
    <metamodelSpringGenerator:App
      xmlns:xmi="http://www.omg.org/XMI"
      xmlns:metamodelSpringGenerator="http://metamodelSpringGenerator"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://metamodelSpringGenerator ../model/metamodelSpringGenerator.ecore"
      xmi:version="{@xmi:version}">
      <xsl:apply-templates select="@*[local-name() != 'xmi:version']"/>
      <xsl:apply-templates/>
    </metamodelSpringGenerator:App>
  </xsl:template>

</xsl:stylesheet>
