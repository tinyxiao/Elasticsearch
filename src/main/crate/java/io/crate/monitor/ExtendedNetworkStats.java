/*
 * Licensed to Crate under one or more contributor license agreements.
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Crate licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * However, if you have executed another commercial license agreement
 * with Crate these terms will supersede the license and you may use the
 * software solely pursuant to the terms of the relevant commercial
 * agreement.
 */

package io.crate.monitor;

public class ExtendedNetworkStats {

    private final Tcp tcp;
    private long timestamp;

    public ExtendedNetworkStats(Tcp tcp) {
        this.tcp = tcp;
    }

    public long timestamp() {
        return timestamp;
    }

    public void timestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Tcp tcp() {
        return tcp;
    }


    public static class Tcp {

        private long activeOpens;
        private long passiveOpens;
        private long attemptFails;
        private long estabResets;
        private long currEstab;
        private long inSegs;
        private long outSegs;
        private long retransSegs;
        private long inErrs;
        private long outRsts;

        public Tcp() {
        }

        public Tcp(long activeOpens,
                   long passiveOpens,
                   long attemptFails,
                   long estabResets,
                   long currEstab,
                   long inSegs,
                   long outSegs,
                   long retransSegs,
                   long inErrs,
                   long outRsts) {
            this.activeOpens = activeOpens;
            this.passiveOpens = passiveOpens;
            this.attemptFails = attemptFails;
            this.estabResets = estabResets;
            this.currEstab = currEstab;
            this.inSegs = inSegs;
            this.outSegs = outSegs;
            this.retransSegs = retransSegs;
            this.inErrs = inErrs;
            this.outRsts = outRsts;
        }

        public long activeOpens() {
            return activeOpens;
        }

        public long passiveOpens() {
            return passiveOpens;
        }

        public long attemptFails() {
            return attemptFails;
        }

        public long estabResets() {
            return estabResets;
        }

        public long currEstab() {
            return currEstab;
        }

        public long inSegs() {
            return inSegs;
        }

        public long outSegs() {
            return outSegs;
        }

        public long retransSegs() {
            return retransSegs;
        }

        public long inErrs() {
            return inErrs;
        }

        public long outRsts() {
            return outRsts;
        }
    }
}
