package tmttyped.node.cryptoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckPrimeOptions extends StObject {
  
  /**
    * The number of Miller-Rabin probabilistic primality iterations to perform.
    * When the value is 0 (zero), a number of checks is used that yields a false positive rate of at most 2-64 for random input.
    * Care must be used when selecting a number of checks.
    * Refer to the OpenSSL documentation for the BN_is_prime_ex function nchecks options for more details.
    *
    * @default 0
    */
  var checks: js.UndefOr[Double] = js.undefined
}
object CheckPrimeOptions {
  
  @scala.inline
  def apply(): CheckPrimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckPrimeOptions]
  }
  
  @scala.inline
  implicit class CheckPrimeOptionsMutableBuilder[Self <: CheckPrimeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecks(value: Double): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
  }
}
