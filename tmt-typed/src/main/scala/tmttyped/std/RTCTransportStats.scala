package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  var dtlsCipher: js.UndefOr[java.lang.String] = js.undefined
  
  var dtlsState: js.UndefOr[RTCDtlsTransportState] = js.undefined
  
  var iceRole: js.UndefOr[RTCIceRole] = js.undefined
  
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var packetsReceived: js.UndefOr[Double] = js.undefined
  
  var packetsSent: js.UndefOr[Double] = js.undefined
  
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  var rtcpTransportStatsId: js.UndefOr[java.lang.String] = js.undefined
  
  var selectedCandidatePairChanges: js.UndefOr[Double] = js.undefined
  
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
  
  var srtpCipher: js.UndefOr[java.lang.String] = js.undefined
  
  var tlsGroup: js.UndefOr[java.lang.String] = js.undefined
  
  var tlsVersion: js.UndefOr[java.lang.String] = js.undefined
}
object RTCTransportStats {
  
  @scala.inline
  def apply(): RTCTransportStats = {
    val __obj = js.Dynamic.literal()
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
    def setDtlsStateUndefined: Self = StObject.set(x, "dtlsState", js.undefined)
    
    @scala.inline
    def setIceRole(value: RTCIceRole): Self = StObject.set(x, "iceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIceRoleUndefined: Self = StObject.set(x, "iceRole", js.undefined)
    
    @scala.inline
    def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    @scala.inline
    def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
    
    @scala.inline
    def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
    
    @scala.inline
    def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    @scala.inline
    def setRtcpTransportStatsId(value: java.lang.String): Self = StObject.set(x, "rtcpTransportStatsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtcpTransportStatsIdUndefined: Self = StObject.set(x, "rtcpTransportStatsId", js.undefined)
    
    @scala.inline
    def setSelectedCandidatePairChanges(value: Double): Self = StObject.set(x, "selectedCandidatePairChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCandidatePairChangesUndefined: Self = StObject.set(x, "selectedCandidatePairChanges", js.undefined)
    
    @scala.inline
    def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
    
    @scala.inline
    def setSrtpCipher(value: java.lang.String): Self = StObject.set(x, "srtpCipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrtpCipherUndefined: Self = StObject.set(x, "srtpCipher", js.undefined)
    
    @scala.inline
    def setTlsGroup(value: java.lang.String): Self = StObject.set(x, "tlsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsGroupUndefined: Self = StObject.set(x, "tlsGroup", js.undefined)
    
    @scala.inline
    def setTlsVersion(value: java.lang.String): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
  }
}
