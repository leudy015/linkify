import { NativeModules } from 'react-native';

const { DynamicLinksModule } = NativeModules;


export class Linkify {
    static async getInitialLink(): Promise<string> {
        try {
            const link = await DynamicLinksModule.getInitialLink();
            return link;
        } catch (error) {
            console.error('Error getting dynamic link', error);
            return '';
        }
    }

    static listenForDynamicLink(callback: (link: string) => void) {
        DynamicLinksModule.listenForDynamicLink();
        // Logic for callback when a dynamic link is opened
        DynamicLinksModule.addListener('DynamicLinkOpened', (link: string) => {
            callback(link);
        });
    }
}
