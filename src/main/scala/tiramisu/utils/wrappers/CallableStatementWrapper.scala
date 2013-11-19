package com.chrisstucchio.tiramisu.utils.wrappers

trait CallableStatementWrapper extends PreparedStatementWrapper with java.sql.CallableStatement {
  protected val stmt: java.sql.CallableStatement

  def setAsciiStream(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { stmt.setAsciiStream(x$1,x$2) }
  def setAsciiStream(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { stmt.setAsciiStream(x$1,x$2, x$3) }
  def setAsciiStream(x$1: String,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { stmt.setAsciiStream(x$1,x$2, x$3) }
  def setBigDecimal(x$1: String,x$2: java.math.BigDecimal): Unit = methodWrap { stmt.setBigDecimal(x$1,x$2) }
  def setBinaryStream(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { stmt.setBinaryStream(x$1,x$2) }
  def setBinaryStream(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { stmt.setBinaryStream(x$1,x$2,x$3) }
  def setBinaryStream(x$1: String,x$2: java.io.InputStream,x$3: Int): Unit = methodWrap { stmt.setBinaryStream(x$1,x$2,x$3) }
  def setBlob(x$1: String,x$2: java.io.InputStream): Unit = methodWrap { stmt.setBlob(x$1,x$2) }
  def setBlob(x$1: String,x$2: java.io.InputStream,x$3: Long): Unit = methodWrap { stmt.setBlob(x$1,x$2, x$3) }
  def setBlob(x$1: String,x$2: java.sql.Blob): Unit = methodWrap { stmt.setBlob(x$1,x$2) }
  def setBoolean(x$1: String,x$2: Boolean): Unit = methodWrap { stmt.setBoolean(x$1,x$2) }
  def setByte(x$1: String,x$2: Byte): Unit = methodWrap { stmt.setByte(x$1,x$2) }
  def setBytes(x$1: String,x$2: Array[Byte]): Unit = methodWrap { stmt.setBytes(x$1,x$2) }
  def setCharacterStream(x$1: String,x$2: java.io.Reader): Unit = methodWrap { stmt.setCharacterStream(x$1,x$2) }
  def setCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { stmt.setCharacterStream(x$1,x$2,x$3) }
  def setCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Int): Unit = methodWrap { stmt.setCharacterStream(x$1,x$2,x$3) }
  def setClob(x$1: String,x$2: java.io.Reader): Unit = methodWrap { stmt.setClob(x$1,x$2) }
  def setClob(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { stmt.setClob(x$1,x$2,x$3) }
  def setClob(x$1: String,x$2: java.sql.Clob): Unit = methodWrap { stmt.setClob(x$1,x$2) }
  def setDate(x$1: String,x$2: java.sql.Date,x$3: java.util.Calendar): Unit = methodWrap { stmt.setDate(x$1,x$2,x$3) }
  def setDate(x$1: String,x$2: java.sql.Date): Unit = methodWrap { stmt.setDate(x$1,x$2) }
  def setDouble(x$1: String,x$2: Double): Unit = methodWrap { stmt.setDouble(x$1,x$2) }
  def setFloat(x$1: String,x$2: Float): Unit = methodWrap { stmt.setFloat(x$1,x$2) }
  def setInt(x$1: String,x$2: Int): Unit = methodWrap { stmt.setInt(x$1,x$2) }
  def setLong(x$1: String,x$2: Long): Unit = methodWrap { stmt.setLong(x$1,x$2) }
  def setNCharacterStream(x$1: String,x$2: java.io.Reader): Unit = methodWrap { stmt.setNCharacterStream(x$1,x$2) }
  def setNCharacterStream(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { stmt.setNCharacterStream(x$1,x$2,x$3) }
  def setNClob(x$1: String,x$2: java.io.Reader): Unit = methodWrap { stmt.setNClob(x$1,x$2) }
  def setNClob(x$1: String,x$2: java.io.Reader,x$3: Long): Unit = methodWrap { stmt.setNClob(x$1,x$2,x$3) }
  def setNClob(x$1: String,x$2: java.sql.NClob): Unit = methodWrap { stmt.setNClob(x$1,x$2) }
  def setNString(x$1: String,x$2: String): Unit = methodWrap { stmt.setNString(x$1,x$2) }
  def setNull(x$1: String,x$2: Int,x$3: String): Unit = methodWrap { stmt.setNull(x$1,x$2,x$3) }
  def setNull(x$1: String,x$2: Int): Unit = methodWrap { stmt.setNull(x$1,x$2) }
  def setObject(x$1: String,x$2: Any,x$3: Int,x$4: Int): Unit = methodWrap { stmt.setObject(x$1,x$2,x$3,x$4) }
  def setObject(x$1: String,x$2: Any): Unit = methodWrap { stmt.setObject(x$1,x$2) }
  def setObject(x$1: String,x$2: Any,x$3: Int): Unit = methodWrap { stmt.setObject(x$1,x$2,x$3) }
  def setRowId(x$1: String,x$2: java.sql.RowId): Unit = methodWrap { stmt.setRowId(x$1,x$2) }
  def setSQLXML(x$1: String,x$2: java.sql.SQLXML): Unit = methodWrap { stmt.setSQLXML(x$1,x$2) }
  def setShort(x$1: String,x$2: Short): Unit = methodWrap { stmt.setShort(x$1,x$2) }
  def setString(x$1: String,x$2: String): Unit = methodWrap { stmt.setString(x$1,x$2) }
  def setTime(x$1: String,x$2: java.sql.Time,x$3: java.util.Calendar): Unit = methodWrap { stmt.setTime(x$1,x$2,x$3) }
  def setTime(x$1: String,x$2: java.sql.Time): Unit = methodWrap { stmt.setTime(x$1,x$2) }
  def setTimestamp(x$1: String,x$2: java.sql.Timestamp,x$3: java.util.Calendar): Unit = methodWrap { stmt.setTimestamp(x$1,x$2,x$3) }
  def setTimestamp(x$1: String,x$2: java.sql.Timestamp): Unit = methodWrap { stmt.setTimestamp(x$1,x$2) }
  def setURL(x$1: String,x$2: java.net.URL): Unit = methodWrap { stmt.setURL(x$1,x$2) }

  def getArray(x$1: String): java.sql.Array = methodWrap { stmt.getArray(x$1) }
  def getArray(x$1: Int): java.sql.Array = methodWrap { stmt.getArray(x$1) }
  def getBigDecimal(x$1: String): java.math.BigDecimal = methodWrap { stmt.getBigDecimal(x$1) }
  def getBigDecimal(x$1: Int): java.math.BigDecimal = methodWrap { stmt.getBigDecimal(x$1) }
  def getBigDecimal(x$1: Int,x$2: Int): java.math.BigDecimal = methodWrap { stmt.getBigDecimal(x$1, x$2) }
  def getBlob(x$1: String): java.sql.Blob = methodWrap { stmt.getBlob(x$1) }
  def getBlob(x$1: Int): java.sql.Blob = methodWrap { stmt.getBlob(x$1) }
  def getBoolean(x$1: String): Boolean = methodWrap { stmt.getBoolean(x$1) }
  def getBoolean(x$1: Int): Boolean = methodWrap { stmt.getBoolean(x$1) }
  def getByte(x$1: String): Byte = methodWrap { stmt.getByte(x$1) }
  def getByte(x$1: Int): Byte = methodWrap { stmt.getByte(x$1) }
  def getBytes(x$1: String): Array[Byte] = methodWrap { stmt.getBytes(x$1) }
  def getBytes(x$1: Int): Array[Byte] = methodWrap { stmt.getBytes(x$1) }
  def getCharacterStream(x$1: String): java.io.Reader = methodWrap { stmt.getCharacterStream(x$1) }
  def getCharacterStream(x$1: Int): java.io.Reader = methodWrap { stmt.getCharacterStream(x$1) }
  def getClob(x$1: String): java.sql.Clob = methodWrap { stmt.getClob(x$1) }
  def getClob(x$1: Int): java.sql.Clob = methodWrap { stmt.getClob(x$1) }
  def getDate(x$1: String,x$2: java.util.Calendar): java.sql.Date = methodWrap { stmt.getDate(x$1,x$2) }
  def getDate(x$1: Int,x$2: java.util.Calendar): java.sql.Date = methodWrap { stmt.getDate(x$1,x$2) }
  def getDate(x$1: String): java.sql.Date = methodWrap { stmt.getDate(x$1) }
  def getDate(x$1: Int): java.sql.Date = methodWrap { stmt.getDate(x$1) }
  def getDouble(x$1: String): Double = methodWrap { stmt.getDouble(x$1) }
  def getDouble(x$1: Int): Double = methodWrap { stmt.getDouble(x$1) }
  def getFloat(x$1: String): Float = methodWrap { stmt.getFloat(x$1) }
  def getFloat(x$1: Int): Float = methodWrap { stmt.getFloat(x$1) }
  def getInt(x$1: String): Int = methodWrap { stmt.getInt(x$1) }
  def getInt(x$1: Int): Int = methodWrap { stmt.getInt(x$1) }
  def getLong(x$1: String): Long = methodWrap { stmt.getLong(x$1) }
  def getLong(x$1: Int): Long = methodWrap { stmt.getLong(x$1) }
  def getNCharacterStream(x$1: String): java.io.Reader = methodWrap { stmt.getNCharacterStream(x$1) }
  def getNCharacterStream(x$1: Int): java.io.Reader = methodWrap { stmt.getNCharacterStream(x$1) }
  def getNClob(x$1: String): java.sql.NClob = methodWrap { stmt.getNClob(x$1) }
  def getNClob(x$1: Int): java.sql.NClob = methodWrap { stmt.getNClob(x$1) }
  def getNString(x$1: String): String = methodWrap { stmt.getNString(x$1) }
  def getNString(x$1: Int): String = methodWrap { stmt.getNString(x$1) }
  def getObject[T](x$1: String,x$2: Class[T]): T = methodWrap { stmt.getObject(x$1,x$2) }
  def getObject[T](x$1: Int,x$2: Class[T]): T = methodWrap { stmt.getObject(x$1,x$2) }
  def getObject(x$1: String,x$2: java.util.Map[String,Class[_]]): Object = methodWrap { stmt.getObject(x$1,x$2) }
  def getObject(x$1: Int,x$2: java.util.Map[String,Class[_]]): Object = methodWrap { stmt.getObject(x$1,x$2) }
  def getObject(x$1: String): Object = methodWrap { stmt.getObject(x$1) }
  def getObject(x$1: Int): Object = methodWrap { stmt.getObject(x$1) }
  def getRef(x$1: String): java.sql.Ref = methodWrap { stmt.getRef(x$1) }
  def getRef(x$1: Int): java.sql.Ref = methodWrap { stmt.getRef(x$1) }
  def getRowId(x$1: String): java.sql.RowId = methodWrap { stmt.getRowId(x$1) }
  def getRowId(x$1: Int): java.sql.RowId = methodWrap { stmt.getRowId(x$1) }
  def getSQLXML(x$1: String): java.sql.SQLXML = methodWrap { stmt.getSQLXML(x$1) }
  def getSQLXML(x$1: Int): java.sql.SQLXML = methodWrap { stmt.getSQLXML(x$1) }
  def getShort(x$1: String): Short = methodWrap { stmt.getShort(x$1) }
  def getShort(x$1: Int): Short = methodWrap { stmt.getShort(x$1) }
  def getString(x$1: String): String = methodWrap { stmt.getString(x$1) }
  def getString(x$1: Int): String = methodWrap { stmt.getString(x$1) }
  def getTime(x$1: String,x$2: java.util.Calendar): java.sql.Time = methodWrap { stmt.getTime(x$1,x$2) }
  def getTime(x$1: Int,x$2: java.util.Calendar): java.sql.Time = methodWrap { stmt.getTime(x$1,x$2) }
  def getTime(x$1: String): java.sql.Time = methodWrap { stmt.getTime(x$1) }
  def getTime(x$1: Int): java.sql.Time = methodWrap { stmt.getTime(x$1) }
  def getTimestamp(x$1: String,x$2: java.util.Calendar): java.sql.Timestamp = methodWrap { stmt.getTimestamp(x$1,x$2) }
  def getTimestamp(x$1: Int,x$2: java.util.Calendar): java.sql.Timestamp = methodWrap { stmt.getTimestamp(x$1,x$2) }
  def getTimestamp(x$1: String): java.sql.Timestamp = methodWrap { stmt.getTimestamp(x$1) }
  def getTimestamp(x$1: Int): java.sql.Timestamp = methodWrap { stmt.getTimestamp(x$1) }
  def getURL(x$1: String): java.net.URL = methodWrap { stmt.getURL(x$1) }
  def getURL(x$1: Int): java.net.URL = methodWrap { stmt.getURL(x$1) }
  def wasNull(): Boolean = methodWrap { stmt.wasNull() }

  def registerOutParameter(x$1: String,x$2: Int,x$3: String): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2,x$3) }
  def registerOutParameter(x$1: String,x$2: Int,x$3: Int): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2,x$3) }
  def registerOutParameter(x$1: String,x$2: Int): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2) }
  def registerOutParameter(x$1: Int,x$2: Int,x$3: String): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2,x$3) }
  def registerOutParameter(x$1: Int,x$2: Int,x$3: Int): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2,x$3) }
  def registerOutParameter(x$1: Int,x$2: Int): Unit = methodWrap { stmt.registerOutParameter(x$1,x$2) }
}