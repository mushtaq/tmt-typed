package tmttyped.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidatePairStats
  extends StObject
     with RTCStats {
  
  /* standard DOM */
  var availableIncomingBitrate: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var availableOutgoingBitrate: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var currentRoundTripTime: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var localCandidateId: java.lang.String
  
  /* standard DOM */
  var nominated: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard DOM */
  var remoteCandidateId: java.lang.String
  
  /* standard DOM */
  var requestsReceived: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var requestsSent: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var responsesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var responsesSent: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var state: RTCStatsIceCandidatePairState
  
  /* standard DOM */
  var totalRoundTripTime: js.UndefOr[Double] = js.undefined
  
  /* standard DOM */
  var transportId: java.lang.String
}
object RTCIceCandidatePairStats {
  
  @scala.inline
  def apply(
    id: java.lang.String,
    localCandidateId: java.lang.String,
    remoteCandidateId: java.lang.String,
    state: RTCStatsIceCandidatePairState,
    timestamp: DOMHighResTimeStamp,
    transportId: java.lang.String,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCIceCandidatePairStats = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], localCandidateId = localCandidateId.asInstanceOf[js.Any], remoteCandidateId = remoteCandidateId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePairStats]
  }
  
  @scala.inline
  implicit class RTCIceCandidatePairStatsMutableBuilder[Self <: RTCIceCandidatePairStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableIncomingBitrate(value: Double): Self = StObject.set(x, "availableIncomingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableIncomingBitrateUndefined: Self = StObject.set(x, "availableIncomingBitrate", js.undefined)
    
    @scala.inline
    def setAvailableOutgoingBitrate(value: Double): Self = StObject.set(x, "availableOutgoingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableOutgoingBitrateUndefined: Self = StObject.set(x, "availableOutgoingBitrate", js.undefined)
    
    @scala.inline
    def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    @scala.inline
    def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    @scala.inline
    def setCurrentRoundTripTime(value: Double): Self = StObject.set(x, "currentRoundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRoundTripTimeUndefined: Self = StObject.set(x, "currentRoundTripTime", js.undefined)
    
    @scala.inline
    def setLocalCandidateId(value: java.lang.String): Self = StObject.set(x, "localCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNominated(value: scala.Boolean): Self = StObject.set(x, "nominated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNominatedUndefined: Self = StObject.set(x, "nominated", js.undefined)
    
    @scala.inline
    def setRemoteCandidateId(value: java.lang.String): Self = StObject.set(x, "remoteCandidateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsReceived(value: Double): Self = StObject.set(x, "requestsReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsReceivedUndefined: Self = StObject.set(x, "requestsReceived", js.undefined)
    
    @scala.inline
    def setRequestsSent(value: Double): Self = StObject.set(x, "requestsSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsSentUndefined: Self = StObject.set(x, "requestsSent", js.undefined)
    
    @scala.inline
    def setResponsesReceived(value: Double): Self = StObject.set(x, "responsesReceived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesReceivedUndefined: Self = StObject.set(x, "responsesReceived", js.undefined)
    
    @scala.inline
    def setResponsesSent(value: Double): Self = StObject.set(x, "responsesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponsesSentUndefined: Self = StObject.set(x, "responsesSent", js.undefined)
    
    @scala.inline
    def setState(value: RTCStatsIceCandidatePairState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRoundTripTime(value: Double): Self = StObject.set(x, "totalRoundTripTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRoundTripTimeUndefined: Self = StObject.set(x, "totalRoundTripTime", js.undefined)
    
    @scala.inline
    def setTransportId(value: java.lang.String): Self = StObject.set(x, "transportId", value.asInstanceOf[js.Any])
  }
}
