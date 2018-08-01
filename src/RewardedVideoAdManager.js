/**
 * RewardedVideoAdManager.js
 * react-native-fbads
 *
 * Created by Logan Hendershot on 03/10/18
 * Copyright © 2016 Callstack.io. All rights reserved.
 *
 * @flow
 */

import { NativeModules } from 'react-native';

const { CTKRewardedVideoAdManager } = NativeModules;

export default {
  loadAd(placementId: string): Promise<boolean> {
    return CTKRewardedVideoAdManager.loadAd(placementId);
  },

  showAd(): Promise<boolean> {
    return CTKRewardedVideoAdManager.showAd();
  },
};
