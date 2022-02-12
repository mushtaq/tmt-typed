package tmttyped.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormat extends StObject {
  
  def format(value: js.BigInt): String = js.native
  /* standard es2020.bigint */
  def format(value: Double): String = js.native
  
  def formatRange(startDate: js.BigInt, endDate: js.BigInt): String = js.native
  def formatRange(startDate: js.BigInt, endDate: Double): String = js.native
  def formatRange(startDate: Double, endDate: js.BigInt): String = js.native
  /* standard es2021.intl */
  def formatRange(startDate: Double, endDate: Double): String = js.native
  
  def formatRangeToParts(startDate: js.BigInt, endDate: js.BigInt): js.Array[NumberFormatPart] = js.native
  def formatRangeToParts(startDate: js.BigInt, endDate: Double): js.Array[NumberFormatPart] = js.native
  def formatRangeToParts(startDate: Double, endDate: js.BigInt): js.Array[NumberFormatPart] = js.native
  /* standard es2021.intl */
  def formatRangeToParts(startDate: Double, endDate: Double): js.Array[NumberFormatPart] = js.native
  
  /* standard es2018.intl */
  def formatToParts(): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: js.BigInt): js.Array[NumberFormatPart] = js.native
  def formatToParts(number: Double): js.Array[NumberFormatPart] = js.native
  
  /* standard es2020.bigint */
  def resolvedOptions(): ResolvedNumberFormatOptions = js.native
}
