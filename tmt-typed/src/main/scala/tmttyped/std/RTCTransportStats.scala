package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  /* standard DOM */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var dtlsCipher: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var dtlsState: RTCDtlsTransportState
  
  /* standard DOM */
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var srtpCipher: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard DOM */
  var tlsVersion: js.UndefOr[java.lang.String] = js.undefined
}
object RTCTransportStats {
  
  @scala.inline
  def apply(
    dtlsState: RTCDtlsTransportState,
    id: java.lang.String,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal(dtlsState = dtlsState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  
  @scala.inline
  implicit class RTCTransportStatsMutableBuilder[Self <: RTCTransportStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setDtlsCipher(value: java.lang.String): Self = StObject.set(x, "dtlsCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDtlsCipherUndefined: Self = StObject.set(x, "dtlsCipher", js.undefined)
    
    @scala.inline
    def setDtlsState(value: RTCDtlsTransportState): Self = StObject.set(x, "dtlsState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    @scala.inline
    def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    @scala.inline
    def setRtcpTransportStatsId(value: java.lang.String): Self = StObject.set(x, "rtcpTransportStatsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpTransportStatsIdUndefined: Self = StObject.set(x, "rtcpTransportStatsId", js.undefined)
    
    @scala.inline
    def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
    
    @scala.inline
    def setSrtpCipher(value: java.lang.String): Self = StObject.set(x, "srtpCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrtpCipherUndefined: Self = StObject.set(x, "srtpCipher", js.undefined)
    
    @scala.inline
    def setTlsVersion(value: java.lang.String): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
  }
}
