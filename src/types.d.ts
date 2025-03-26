interface LinkifyModule {
  getInitialLink: () => Promise<string>;
  listenForDynamicLink: (callback: (link: string) => void) => void;
}

export { LinkifyModule };
