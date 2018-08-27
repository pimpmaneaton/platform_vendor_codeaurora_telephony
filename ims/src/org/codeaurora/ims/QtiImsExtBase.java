/* Copyright (c) 2016,2017 The Linux Foundation. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 *       copyright notice, this list of conditions and the following
 *       disclaimer in the documentation and/or other materials provided
 *       with the distribution.
 *     * Neither the name of The Linux Foundation nor the names of its
 *       contributors may be used to endorse or promote products derived
 *       from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS
 * BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR
 * BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN
 * IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.codeaurora.ims;

import org.codeaurora.ims.internal.IQtiImsExt;
import org.codeaurora.ims.internal.IQtiImsExtListener;
import org.codeaurora.ims.QtiCallConstants;

/**
 * Base implementation for IQtiImsExt.
 */
public abstract class QtiImsExtBase {

    /*
     * Implement the methods of the IQtiImsExt interface in this stub
     */
    public final class QtiImsExtBinder extends IQtiImsExt.Stub {

        @Override
        public void setCallForwardUncondTimer(int phoneId, int startHour, int startMinute,
                int endHour, int endMinute, int action, int condition, int serviceClass,
                String number, IQtiImsExtListener listener) {
            onSetCallForwardUncondTimer(phoneId, startHour, startMinute, endHour, endMinute, action,
                condition, serviceClass, number, listener);
        }

        @Override
        public void getCallForwardUncondTimer(int phoneId, int reason, int serviceClass,
                IQtiImsExtListener listener) {
            onGetCallForwardUncondTimer(phoneId, reason, serviceClass, listener);
        }

        @Override
        public void getPacketCount(int phoneId, IQtiImsExtListener listener) {
            onGetPacketCount(phoneId, listener);
        }

        @Override
        public void getPacketErrorCount(int phoneId, IQtiImsExtListener listener) {
            onGetPacketErrorCount(phoneId, listener);
        }

        @Override
        public void resumePendingCall(int phoneId, int videoState) {
            onResumePendingCall(phoneId, videoState);
        }

        @Override
        public void sendCallTransferRequest(int phoneId, int type, String number,
                IQtiImsExtListener listener) {
            onSendCallTransferRequest(phoneId, type, number, listener);
        }

        @Override
        public void sendCancelModifyCall(int phoneId, IQtiImsExtListener listener) {
            onSendCancelModifyCall(phoneId, listener);
        }

        @Override
        public void queryVopsStatus(int phoneId, IQtiImsExtListener listener) {
            onQueryVopsStatus(phoneId, listener);
        }

        @Override
        public void querySsacStatus(int phoneId, IQtiImsExtListener listener) {
            onQuerySsacStatus(phoneId, listener);
        }

        @Override
        public void registerForParticipantStatusInfo(int phoneId, IQtiImsExtListener listener) {
            onRegisterForParticipantStatusInfo(phoneId, listener);
        }

        @Override
        public void updateVoltePreference(int phoneId, int preference,
                IQtiImsExtListener listener) {
            onUpdateVoltePreference(phoneId, preference, listener);
        }

        @Override
        public void queryVoltePreference(int phoneId, IQtiImsExtListener listener) {
            onQueryVoltePreference(phoneId, listener);
        }

        @Override
        public void getHandoverConfig(int phoneId, IQtiImsExtListener listener) {
            onGetHandoverConfig(phoneId, listener);
        }

        @Override
        public void setHandoverConfig(int phoneId, int hoConfig,
                IQtiImsExtListener listener) {
            onSetHandoverConfig(phoneId, hoConfig, listener);
        }

        @Override
        public int setRcsAppConfig(int phoneId, int defaultSmsApp) {
            return onSetRcsAppConfig(phoneId, defaultSmsApp);
        }

        @Override
        public int getRcsAppConfig(int phoneId) {
            return onGetRcsAppConfig(phoneId);

        }

        @Override
        public int setVvmAppConfig(int phoneId, int defaultVvmApp) {
            return onSetVvmAppConfig(phoneId, defaultVvmApp);
        }

        @Override
        public int getVvmAppConfig(int phoneId) {
            return onGetVvmAppConfig(phoneId);
        }

    };

    private QtiImsExtBinder mQtiImsExtBinder;

    public QtiImsExtBinder getBinder() {
        if (mQtiImsExtBinder == null) {
            mQtiImsExtBinder = new QtiImsExtBinder();
        }
        return mQtiImsExtBinder;
    }

    protected void onSetCallForwardUncondTimer(int phoneId, int startHour, int startMinute,
            int endHour, int endMinute, int action, int condition, int serviceClass, String number,
            IQtiImsExtListener listener) {
        // no-op
    }
    protected void onGetCallForwardUncondTimer(int phoneId, int reason, int serviceClass,
            IQtiImsExtListener listener) {
        // no-op
    }
    protected void onGetPacketCount(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onGetPacketErrorCount(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onResumePendingCall(int phoneId, int videoState) {
        // no-op
    }
    protected void onSendCallTransferRequest(int phoneId, int type, String number,
            IQtiImsExtListener listener) {
        // no-op
    }

    protected void onSendCancelModifyCall(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }

    protected void onQueryVopsStatus(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onQuerySsacStatus(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onRegisterForViceRefreshInfo(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onRegisterForParticipantStatusInfo(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onUpdateVoltePreference(int phoneId, int preference,
            IQtiImsExtListener listener) {
        // no-op
    }
    protected void onQueryVoltePreference(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onGetHandoverConfig(int phoneId, IQtiImsExtListener listener) {
        // no-op
    }
    protected void onSetHandoverConfig(int phoneId, int hoConfig,
            IQtiImsExtListener listener) {
        // no-op
    }
    protected int onGetVvmAppConfig(int phoneId) {
        // no-op
        return 0; //DUMMY VALUE
    }
    protected int onSetVvmAppConfig(int phoneId, int defaultVvmApp) {
        // no-op
        return 0; //DUMMY VALUE
    }
    protected int onGetRcsAppConfig(int phoneId) {
        // no-op
        return 0; //DUMMY VALUE
    }
    protected int onSetRcsAppConfig(int phoneId, int defaultSmsApp) {
        // no-op
        return 0; //DUMMY VALUE
    }
}
