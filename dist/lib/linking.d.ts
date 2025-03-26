export declare class Linkify {
    static getInitialLink(): Promise<string>;
    static listenForDynamicLink(callback: (link: string) => void): void;
}
