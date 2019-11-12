package com.spark.udf.reflect.common

import com.spark.udf.register.impl.UDFRegisterTrait
import org.apache.spark.sql.SparkSession

import scala.collection.mutable

class UDFClassLoaderManager {
  private val udfMethodInfos = new mutable.HashMap[String, UDFMethodInfo]
  def this(path: String, udfMapping: Map[String, String]) {
    this()
  }

  /**
    *
    * @param udfRegister
    */
  def register(spark: SparkSession, udfRegister: UDFRegisterTrait): Unit = {

    udfRegister.register(spark)

  }
}