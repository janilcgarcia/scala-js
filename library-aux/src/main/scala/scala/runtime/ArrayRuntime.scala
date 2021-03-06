/*
 * Scala.js (https://www.scala-js.org/)
 *
 * Copyright EPFL.
 *
 * Licensed under Apache License 2.0
 * (https://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.runtime

/** Not for public consumption.  Usage by the runtime only.
 */

object ArrayRuntime {
  def cloneArray(array: Array[Boolean]): Array[Boolean] = array.clone()
  def cloneArray(array: Array[Char]): Array[Char] = array.clone()
  def cloneArray(array: Array[Byte]): Array[Byte] = array.clone()
  def cloneArray(array: Array[Short]): Array[Short] = array.clone()
  def cloneArray(array: Array[Int]): Array[Int] = array.clone()
  def cloneArray(array: Array[Long]): Array[Long] = array.clone()
  def cloneArray(array: Array[Float]): Array[Float] = array.clone()
  def cloneArray(array: Array[Double]): Array[Double] = array.clone()
  def cloneArray(array: Array[Object]): Array[Object] = array.clone()
}
